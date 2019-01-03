package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		Connection conn = null;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\javawork\\workspace\\practiceMall\\WebContent\\properties\\jdbc.properties");
		prop.load(fis);
		String DB_DRIVERNAME = prop.getProperty("DB_DRIVERNAME");
		String DB_URL = prop.getProperty("DB_URL");
		String DB_USER = prop.getProperty("DB_USER");
		String DB_PASSWORD = prop.getProperty("DB_PASSWORD");

		Class.forName(DB_DRIVERNAME);

		conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

		return conn;
	}
}
