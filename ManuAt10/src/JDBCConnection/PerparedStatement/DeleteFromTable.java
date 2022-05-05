package JDBCConnection.PerparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteFromTable {
	public static void main(String[] args) throws SQLException {
		String query = "DELETE FROM student WHERE id = ?";
		String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		String user = "rajkabee";
		String pass = "password@123";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the id of the studnet to be deleted: ");
		pstm.setInt(1, new Scanner(System.in).nextInt());
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("Deleted!");
		}
		con.close();

	}
}
