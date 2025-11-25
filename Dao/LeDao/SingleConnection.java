package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class SingleConnection  {
	private static Connection connect;

	private SingleConnection() {
		String databaseName="absences";
		// Parametres de connexion : url, login, mdp
		// Port mysql avec USBWebserver:3307, xampp: 3306
		String url="jdbc:mysql://localhost:3307/"+databaseName+"?serverTimezone=UTC";
		String login="root"; // dans l'idal un login de connexion pour l'application, et non root...
		//String password=""; // mot de passe avec xampp
		String password="usbw"; // mot de passe root avec USBWebServer

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver OK !");
			connect= DriverManager.getConnection(url, login, password);
			System.out.println("Connexion réussie !");
		} 
		catch (ClassNotFoundException e) {
			System.err.println("Erreur de chargement du driver");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.err.println("Erreur d'ï¿½tablissement de connexion");
			e.printStackTrace();
		}

		// Creation d'une connexion avec MysqlDataSource
		MysqlDataSource mysqlDS = new MysqlDataSource();
		mysqlDS.setURL(url);
		mysqlDS.setUser(login);
		mysqlDS.setPassword(password);

		try {
			connect = mysqlDS.getConnection();
		} catch (SQLException e1) {
			System.err.println("Erreur de parcours de connexion");
			e1.printStackTrace();
		}
		
	}
	
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
