package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T> implements DataAccessObject<T>{
	String url;
	String user;
	String pass;
	Connection con;
	
	@Override
	public void connect() throws SQLException {
		con = DriverManager.getConnection(url, user, pass);
	}
	@Override
	public void disconnect() throws SQLException {
		con.close();
	}
}
