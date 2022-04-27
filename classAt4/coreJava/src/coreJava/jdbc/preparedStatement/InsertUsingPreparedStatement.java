package coreJava.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import coreJava.jdbc.Student;

public class InsertUsingPreparedStatement {
	public static void main(String[] args){
		String dbUrl = "jdbc:mysql://localhost:3306/kcc";
		String dbUser = "root";
		String dbPass = "";
		Student st = new Student("Juddha", "Sumsher", "JuddhaSumsher@gmail.com");
		String query = "INSERT INTO student (fname, lname, email) values(?,?,?)";
		try {
			Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, st.fName);
			pstmt.setString(2, st.lName);
			pstmt.setString(3, st.email);
			
			int i = pstmt.executeUpdate();
			if(i==1) {
				System.out.println("Student added!");
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Failed");
		}
	}
}
