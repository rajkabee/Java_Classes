package JDBCConnection.useDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T> implements DAO<T>{
	String url = "jdbc:mysql://localhost:3306/jdbcpractice";
	String user = "rajkabee";
	String pass = "password@123";
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
