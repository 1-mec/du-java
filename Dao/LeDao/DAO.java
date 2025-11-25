package DAO;

import java.sql.Connection;
import java.sql.Statement;


public abstract class DAO<T> {
	protected Connection connect ;
	protected Statement stmt;
	
	public void open() {
		SingleConnection.getInstance();
	}
	
	public abstract T create (T obj) ;
	public abstract T update (T obj) ;
	public abstract T delete (T obj) ;
	
	public void close() {
		SingleConnection.close(connect);
	}
}
