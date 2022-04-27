package coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAll {
	public static void main(String[] args) throws SQLException{
		String dbUrl = "jdbc:mysql://localhost:3306/kcc";
		String dbUser = "root";
		String dbPass = "";
		String query = "select * from student";
		Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt("id")+". "+
								rs.getString("fName")+" "+
								rs.getString("lName")+"\t"+
								rs.getString("email")
								);
		}
		con.close();
	}

}
