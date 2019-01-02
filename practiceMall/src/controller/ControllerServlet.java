package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controllerServlet", urlPatterns="*.do",
initParams={@WebInitParam(name="configFile", value="handlerNames.properties")})
public class ControllerServlet extends HttpServlet{
	
	private Map<String, CommandHandler> HandlerMap = new HashMap<>();
	
	@Override
	public void init() {
		String handlerFile = this.getInitParameter("configFile");
		Properties prop = new Properties();
		String handlerFilePath = this.getServletContext().getRealPath(handlerFile);
		try(FileInputStream fis = new FileInputStream(handlerFilePath)) {
			prop.load(fis);
			Iterator it = prop.keySet().iterator();
			while(it.hasNext()) {
				String commandUrl = (String)it.next();
				Class<?> HandlerClass = Class.forName(prop.getProperty(commandUrl));
				CommandHandler HandlerInstance = (CommandHandler)HandlerClass.newInstance();
				HandlerMap.put(commandUrl, HandlerInstance);
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		process(req, res);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		process(req, res);
	}
	
	public void process(HttpServletRequest req, HttpServletResponse res) {
		String requestedUrI = req.getRequestURI();
		CommandHandler handler = HandlerMap.get(requestedUrI);
		String view = null;
		if(handler == null) {
			view = new NullHandler().process(req, res);
		}
		view = handler.process(req, res);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher(view);
		try {
			requestDispatcher.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
