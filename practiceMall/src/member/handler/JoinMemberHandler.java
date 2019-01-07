package member.handler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import jdbc.ConnectionProvider;
import jdbc.JdbcUtil;
import member.dao.MemberDao;
import member.dao.MemberDto;

public class JoinMemberHandler implements CommandHandler{
	
	private final String FORM_VIEW = "/WEB-INF/view/joinForm.jsp";
	private MemberDao memberDao = MemberDao.getInstance();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws IOException {
		if(req.getMethod().equalsIgnoreCase("get")) {
			return processForm(req, res);
		} else if(req.getMethod().equalsIgnoreCase("post")) {
			return processSubmit(req, res);
		} else {
			res.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
	}
	
	public String processForm(HttpServletRequest req, HttpServletResponse res) {
		return FORM_VIEW;
	}
	
	public String processSubmit(HttpServletRequest req, HttpServletResponse res) {
		Map<String, Boolean> errors = new HashMap<>();
		req.setAttribute("errors", errors);
		String member_name = req.getParameter("member_name");
		String member_id = req.getParameter("member_id");
		String member_password = req.getParameter("member_password");
		String confirm_password = req.getParameter("confirm_password");
		String member_type = req.getParameter("member_type");
		
		//조건체크
		if(member_name == null || member_name.isEmpty()) {
			errors.put("name", Boolean.TRUE);
		}
		if(member_id == null || member_id.isEmpty()) {
			errors.put("id", Boolean.TRUE);
		}
		if(member_password == null || member_password.isEmpty() || member_password.trim().length() < 8) {
			errors.put("password", Boolean.TRUE);
		}
		if(!member_password.equals(confirm_password)) {
			errors.put("notMatch", Boolean.TRUE);
		}
		
		if(!errors.isEmpty()) {
			return FORM_VIEW;
		} 
		
		MemberDto memberDto = new MemberDto();
		memberDto.setMember_name(member_name);
		memberDto.setMember_id(member_id);
		memberDto.setMember_password(member_password);
		memberDto.setMember_type(member_type);
		
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			MemberDto tmp = memberDao.select(conn, member_id);
			if(tmp != null) {
				throw new IdDuplicateException();
			}
			memberDao.insert(conn, memberDto);
			conn.commit();
		} catch(SQLException e) {
			JdbcUtil.rollback(conn);
			e.printStackTrace();
		} catch(IdDuplicateException e) {
			JdbcUtil.rollback(conn);
			errors.put("duplicate", Boolean.TRUE);
			return FORM_VIEW;
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}
		
		return "/WEB-INF/view/joinSuccess.jsp";
	}

}
