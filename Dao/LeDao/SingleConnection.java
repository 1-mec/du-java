package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class SingleConnection  {
	private static Connection connect;

	private SingleConnection(String db_name,,String url,String login, String password) {

		MysqlDataSource mysqlDS = new MysqlDataSource();
		mysqlDS.setURL(url);
		mysqlDS.setUser(login);
		mysqlDS.setPassword(password);
	
	public static Connection getInstance() {
		if (connect == null) {
			new SingleConnection();
		}
		return connect;
	}
	
	public static void close (Connection conn) {
		try {
			conn.close();
			conn = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

