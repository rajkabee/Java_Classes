package JDBCConnection.PerparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadAllFromTableExample {
	public static void main(String[] args) throws SQLException {
		String query = "SELECT * FROM jdbcpractice.student";
		String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		String user = "rajkabee";
		String pass = "password@123";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		ResultSet rs = pstm.executeQuery();
		ArrayList<Student> stList = new ArrayList<>();
		
		while(rs.next()) {
			Student st=new Student();
			st.setId(rs.getInt("id"));
			st.setfName(rs.getString("fName"));
			st.setlName(rs.getString("lName"));
			st.setEmail(rs.getString("email"));
			stList.add(st);
		}
		for(Student s : stList) {
			System.out.println(s);
		}
		con.close();
		
	}
}
