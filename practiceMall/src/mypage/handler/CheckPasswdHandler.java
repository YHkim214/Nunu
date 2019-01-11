package mypage.handler;

import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;
import jdbc.ConnectionProvider;
import jdbc.JdbcUtil;
import member.dao.MemberDao;
import member.dao.MemberDto;

public class CheckPasswdHandler implements CommandHandler{

	private static final String FORM_VIEW = "/WEB-INF/view/passwdCheck.jsp";
	private MemberDao memberDao = MemberDao.getInstance();
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws IOException {
		if(req.getMethod().equalsIgnoreCase("get")) {
			return processForm(req, res);
		} else if(req.getMethod().equalsIgnoreCase("post")) {
			return processSubmit(req,res);
		} else {
			res.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
	}


	private String processForm(HttpServletRequest req, HttpServletResponse res) {
		return FORM_VIEW;
	}
	
	private String processSubmit(HttpServletRequest req, HttpServletResponse res) {
		Map<String, Boolean> errors = new HashMap<>();
		req.setAttribute("errors", errors);
		String member_id = (String)req.getSession().getAttribute("authUser");
		String member_passwd = req.getParameter("member_passwd");
		if(member_passwd == null || member_passwd.isEmpty()) {
			errors.put("passwd", Boolean.TRUE);
			return FORM_VIEW;
		}
		boolean check = false;
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			check = memberDao.passwdCheck(conn, member_id, member_passwd);
			MemberDto memberDto = memberDao.select(conn, member_id);
			req.setAttribute("member", memberDto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}
		if(check) {
			return "/WEB-INF/view/updateMemberForm.jsp";
		} else {
			errors.put("passwdNotMatch", Boolean.TRUE);
			return FORM_VIEW;
		}
	}

}
