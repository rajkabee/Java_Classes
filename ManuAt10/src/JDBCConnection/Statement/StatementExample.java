package JDBCConnection.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args){
		String driver = "com.mysql.cj.jdbc.Driver";
		Student st = new Student("Gokul", "Bhandari", "gokul@gmail.com");
		try {
			Class.forName(driver);
			/*
			String query = "INSERT INTO jdbcpractice.student values("
					+ "1,"
					+ "'Manu',"
					+ "'RajBhandari',"
					+ "'manu@gmail.com'"
					+ ")";
					*/
			String query = "INSERT INTO jdbcpractice.student (fName, lName, email)"
					+ "VALUES ('"
					+ st.getfName()+"','"
					+ st.getlName()+"','"
					+ st.getEmail()
					+ "')";
			String url = "jdbc:mysql://localhost:3306/jdbcpractice";
			String user = "rajkabee";
			String pass = "password@123";
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stm = con.createStatement();
			int i = stm.executeUpdate(query);
			con.close();
			if(i==1) {
				System.out.println("success");
			}
		} catch (ClassNotFoundException | SQLException e) {
		
			System.out.println(e);
		}
		
		
	}
}
