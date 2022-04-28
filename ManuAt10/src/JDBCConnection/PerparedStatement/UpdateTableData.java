package JDBCConnection.PerparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTableData {
	public static void main(String[] args) {
		System.out.println("Enter the student's id to be updated: ");
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		st.setId(sc.nextInt());
		System.out.println("New First Name: ");
		st.setfName(sc.next());
		System.out.println("New Last Name: ");
		st.setlName(sc.next());
		System.out.println("New Email: ");
		st.setEmail(sc.next());
		
		String query = "UPDATE jdbcpractice.student set fName=?, lName=?, email=?"
				+ " WHERE id=?";
		String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		String user = "rajkabee";
		String pass = "password@123";
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, st.getfName());
			pstm.setString(2, st.getlName());
			pstm.setString(3, st.getEmail());
			pstm.setInt(4, st.getId());
			int i = pstm.executeUpdate();
			if(i==1) {
				System.out.println("Updated");
			}
			
		} catch (SQLException e) {
			System.out.println("Failed");
		}
		
	}
}
