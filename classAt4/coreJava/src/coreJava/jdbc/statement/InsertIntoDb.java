package coreJava.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoDb {
	public static void main(String[] args){
		String dbUrl = "jdbc:mysql://localhost:3306/kcc";
		String dbUser = "root";
		String dbPass = "";
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(dbDriver);
			Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			Statement stmt = con.createStatement();
			String query = "INSERT INTO student (fname, lname, email) values"+
							" ('narayan', 'Pradhan', 'narayan@gmail.com')";
			int i = stmt.executeUpdate(query);
			if(i==1) {
				System.out.println("Student added!");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed");
		}
	}
	
}
