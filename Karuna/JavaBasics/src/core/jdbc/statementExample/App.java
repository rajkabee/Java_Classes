package core.jdbc.statementExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Student st = new Student("Karuna", "Sapkota", "Karuna@gmail.com");
		String url = "jdbc:mysql://localhost:3306/karuna";
		String user = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		// System.out.println("connected to the database!");
		String query = "insert into student (fName, lName, email) values ('" + st.getfName() + "','" + st.getlName()
				+ "','" + st.getEmail() + "')";

		// System.out.println(query);
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		if (i == 1) {
			System.out.println("success");
		}
		con.close();

	}
}
