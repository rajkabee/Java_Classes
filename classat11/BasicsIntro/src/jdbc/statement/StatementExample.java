package jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Student st = new Student(5,"Nawadeep", "Adhikari", "Nawadeep@gmail.com");
		String query = "INSERT INTO student values("+
						st.getId()+",'"+
						st.getfName()+"','"+
						st.getlName()+"','"+
						st.getEmail()+"')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		con.close();
		if(i==1) {
			System.out.println("Success");
		}
						
	}
}
