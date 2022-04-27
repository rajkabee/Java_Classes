package JDBCConnection.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadOneFromDatabase {
	public static void main(String[] args) throws SQLException {
		String query = "SELECT * FROM jdbcpractice.student WHERE id=?";
		System.out.println("Enter the id of the student: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		String user = "rajkabee";
		String pass = "password@123";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		Student st = new Student();
		if(rs.next()) {
			Student s= new Student(
					rs.getInt("id"),
					rs.getString("fName"),
					rs.getString("lName"),
					rs.getString("email")
				);
			st=s;
		}
		System.out.println(st);
		con.close();
		
		
	}
}
