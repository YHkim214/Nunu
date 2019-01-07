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
		/* 식별자를 통해서 context.xml에 명시한 Resource 정보를 반환받아서 DataSource객체에 담아서 객체반환 */ 
		DataSource ds = (DataSource)initctx.lookup("java:comp/env/jdbc/xe");
		/* 커넥션 풀로부터 커넥션을 반환 */
		return ds.getConnection();
	}
}
