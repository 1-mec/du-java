package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class DAO<T> {
	protected Connection connect ;
	protected Statement stmt;
	
	public DAO() {
		open();
	}
	
	public void open() {
		connect = SingleConnection.getInstance();
		try {
			stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public abstract T create (T obj) ;
	public abstract T update (T obj) ;
	public abstract T delete (T obj) ;
	
	public void close() {
		SingleConnection.close(connect);
	}
}
