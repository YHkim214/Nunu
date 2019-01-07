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

public class LoginMemberHandler implements CommandHandler{
	
	private MemberDao memberDao = MemberDao.getInstance();
	private static final String FORM_VIEW = "/WEB-INF/view/loginForm.jsp";
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Map<String, Boolean> errors = new HashMap<>();
		req.setAttribute("errors", errors);
		
		String member_id = req.getParameter("member_id");
		String member_passwd = req.getParameter("member_passwd");
		MemberDto memberDto = null;
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			memberDto = memberDao.select(conn, member_id);
			if(memberDto == null) {
				errors.put("idNotFound", Boolean.TRUE);
				return FORM_VIEW;
			}
			if(!memberDto.isMatched(member_passwd)) {
				errors.put("passwdNotMatch", Boolean.TRUE);
				return FORM_VIEW;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}
		req.getSession().setAttribute("authUser", member_id);
		return "/index.jsp";
	}

}
