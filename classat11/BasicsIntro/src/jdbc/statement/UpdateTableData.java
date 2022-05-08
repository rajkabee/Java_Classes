package jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTableData {
	public static void main(String[] args) throws SQLException {
		String query = "UPDATE student set fName = ?, lName = ?, email=? where id = ?";
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the students details to be updated: \n Id: ");
		pstm.setInt(4, sc.nextInt());
		System.out.println("First Name: ");
		pstm.setString(1, sc.next());
		System.out.println("Last Name: ");
		pstm.setString(2, sc.next());
		System.out.println("Email: ");
		pstm.setString(3, sc.next());
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("succeed");
		}
		con.close();
	}
}
