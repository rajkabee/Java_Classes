package jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedStatementExample {


		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Student st = new Student("Ujjwal", "Sharma", "ujjwal@gmail.com");
			String query = "INSERT INTO student (fname, lname, email) values(?,?,?)";
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dursikshya";
			String user = "root";
			String pass = "root";
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, st.getfName());
			pstm.setString(2, st.getlName());
			pstm.setString(3, st.getEmail());
			int i = pstm.executeUpdate();
			con.close();
			if(i==1) {
				System.out.println("Success");
			}
							
		}
	}

