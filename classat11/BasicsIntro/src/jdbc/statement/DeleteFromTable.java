package jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteFromTable {
	public static void main(String[] args) throws SQLException {
		Student st = new Student();
		String query = "SELECT * FROM student where id = ?";
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the id of the student: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			st.setId(rs.getInt("id"));
			st.setfName(rs.getString("fname"));
			st.setlName(rs.getString("lname"));
			st.setEmail(rs.getString("email"));
		}
		con.close();
		System.out.println(st);
		System.out.println("Confirm Delete(y/n): ");
		char ch = sc.next().charAt(0);
		if(ch=='y') {
			query = "DELETE FROM student where id = ?";
			
			con = DriverManager.getConnection(url, user, pass);
			pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			int i = pstm.executeUpdate();
			if(i==1) {
				System.out.println("deleted");
			}
		}
	}
}
