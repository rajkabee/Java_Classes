package core.jdbc.statementExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsePreparedStatement {
	public static void main(String[] args) throws SQLException {
		Student st = new Student("Bimala", "Maharjan", "bimala@gmail.com");
		String query = "INSERT INTO student (fName, lName, email) values(?,?,?)";
		String url = "jdbc:mysql://localhost:3306/karuna";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, st.getfName());
		pstm.setString(2, st.getlName());
		pstm.setString(3, st.getEmail());
		int i = pstm.executeUpdate();
		if (i == 1) {
			System.out.println("Success!");
		}
	}
}
