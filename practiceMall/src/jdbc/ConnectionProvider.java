package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionProvider {
	public static Connection getConnection() throws NamingException, SQLException {
		Context initctx = new InitialContext();
		/* �ĺ��ڸ� ���ؼ� context.xml�� ����� Resource ������ ��ȯ�޾Ƽ� DataSource��ü�� ��Ƽ� ��ü��ȯ */ 
		DataSource ds = (DataSource)initctx.lookup("java:comp/env/jdbc/xe");
		/* Ŀ�ؼ� Ǯ�κ��� Ŀ�ؼ��� ��ȯ */
		return ds.getConnection();
	}
}
