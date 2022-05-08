package jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAllFromTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String query = "SELECT * FROM student";
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		ResultSet rs = pstm.executeQuery();
		ArrayList<Student> stList = new ArrayList<>();
		while(rs.next()) {
			Student st = new Student();
			st.setId(rs.getInt("id"));
			st.setfName(rs.getString("fname"));
			st.setlName(rs.getString("lname"));
			st.setEmail(rs.getString("email"));
			stList.add(st);
		}
		for(Student s:stList) {
			System.out.println(s);
		}
		
						
	}
}
