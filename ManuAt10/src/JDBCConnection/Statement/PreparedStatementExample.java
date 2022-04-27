package JDBCConnection.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {
	public static void main(String[] args) {
		Student st = new Student("Kiran", "Guragain", "kiran@gmail.com");
		String query = "INSERT INTO jdbcpractice.student (fName, lName, email)"
				+ "VALUES (?,?,?)";
		String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		String user = "rajkabee";
		String pass = "password@123";
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, st.getfName());
			pstm.setString(2, st.getlName());
			pstm.setString(3, st.getEmail());
			int i = pstm.executeUpdate();
			if(i==1) {
				System.out.println("Success");
			}
			
		} catch (SQLException e) {
			System.out.println("Failed");
		}
		
	}
}
