package jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadOneFromTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Student st = new Student();
		String query = "SELECT * FROM student where id = ?";
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the id of the student: ");
		pstm.setInt(1, new Scanner(System.in).nextInt());
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			st.setId(rs.getInt("id"));
			st.setfName(rs.getString("fname"));
			st.setlName(rs.getString("lname"));
			st.setEmail(rs.getString("email"));
		}
		System.out.println(st);
						
	}
}
