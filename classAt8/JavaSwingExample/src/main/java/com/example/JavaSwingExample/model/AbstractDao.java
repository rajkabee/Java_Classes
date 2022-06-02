package com.example.JavaSwingExample.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T> implements DataAccessObject<T> {
	String dbUrl;
	String dbUsername;
	String dbPassword;
	Connection con;
	@Override
	public void connect() throws SQLException {
		con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);	
	}
	@Override
	public void disconnect() throws SQLException {
		con.close();
		
	}
}
