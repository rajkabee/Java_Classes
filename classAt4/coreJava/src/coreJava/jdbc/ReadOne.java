package coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOne {
	public static void main(String[] args) throws SQLException{
		String dbUrl = "jdbc:mysql://localhost:3306/kcc";
		String dbUser = "root";
		String dbPass = "root";
		String query = "select * from student where id = 1";
		Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		if(rs.next()) {
			System.out.println(rs.getInt("id")+". "+
								rs.getString("fName")+" "+
								rs.getString("lName")+"\t"+
								rs.getString("email")
								);
		}
		con.close();
	}
}
