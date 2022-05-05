package JDBCConnection.useDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import JDBCConnection.PerparedStatement.Student;

public class StudentDao extends AbstractDao<Student>{
	
	PreparedStatement pstm;
	ResultSet rs;
	String query;
	@Override
	public int save(Student st) throws SQLException {
			query = "INSERT INTO jdbcpractice.student "
							+ "(fName, lName, email)"
							+ "VALUES (?,?,?)";
			connect();
			pstm = con.prepareStatement(query);
			pstm.setString(1, st.getfName());
			pstm.setString(2, st.getlName());
			pstm.setString(3, st.getEmail());
			int i = pstm.executeUpdate();
			return i;
	}

	@Override
	public Student getOne(int id) throws SQLException {
		query = "SELECT * FROM jdbcpractice.student WHERE id=?";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		Student st = new Student();
		if(rs.next()) {
			st= new Student(
					rs.getInt("id"),
					rs.getString("fName"),
					rs.getString("lName"),
					rs.getString("email")
				);
			
		}
		return st;
	}

	@Override
	public ArrayList<Student> getAll() throws SQLException {
		query = "SELECT * FROM jdbcpractice.student";
		connect();
		pstm = con.prepareStatement(query);
		rs = pstm.executeQuery();
		ArrayList<Student> stList = new ArrayList<>();
		while(rs.next()) {
			Student st=new Student();
			st.setId(rs.getInt("id"));
			st.setfName(rs.getString("fName"));
			st.setlName(rs.getString("lName"));
			st.setEmail(rs.getString("email"));
			stList.add(st);
		}
		return stList;
	}

	@Override
	public int update(Student st) throws SQLException {
		query = "UPDATE jdbcpractice.student set fName=?, lName=?, email=?"
				+ " WHERE id=?";
		connect();
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, st.getfName());
		pstm.setString(2, st.getlName());
		pstm.setString(3, st.getEmail());
		pstm.setInt(4, st.getId());
		int i = pstm.executeUpdate();
		return i;
	}

	@Override
	public int delete(int id) throws SQLException {
		query = "DELETE FROM student WHERE id = ?";
		connect();
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the id of the studnet to be deleted: ");
		pstm.setInt(1, id);
		int i = pstm.executeUpdate();
		return i;
	}

	

}
