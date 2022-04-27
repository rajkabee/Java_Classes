package coreJava.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class StudentDao extends AbstractDao<Student>{
	String query;
	PreparedStatement pstmt;
	ResultSet rs;
	public StudentDao(String url, String user, String pass){
		super.url = url;
		super.user = user;
		super.pass = pass;
	}
	@Override
	public int insert(Student st) {
		query = "INSERT INTO student (fname, lname, email) values(?,?,?)";
		int i=0;
		try {
			connect();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, st.fName);
			pstmt.setString(2, st.lName);
			pstmt.setString(3, st.email);
			i=pstmt.executeUpdate();
			disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public Student getOne(int id) {
		query = "SELECT * FROM student WHERE id=?";
		Student st = new Student();
			try {
				connect();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				rs=pstmt.executeQuery();
				if(rs.next()) {
					st.id = rs.getInt("id");
					st.fName = rs.getString("fName");
					st.lName = rs.getString("lName");
					st.email = rs.getString("email");
				}
				disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return st;
	}

	@Override
	public ArrayList<Student> getAll() {
		connect();
		query = "SELECT * FROM student";
		ArrayList<Student> stList = new ArrayList<>();
		
		
		try {
			pstmt = con.prepareStatement(query);
			rs = null;
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student();
				st.id = rs.getInt("id");
				st.fName = rs.getString("fName");
				st.lName = rs.getString("lName");
				st.email = rs.getString("email");
				stList.add(st);
			}
			disconnect();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stList.add(new Student(5, "sadsada", "sdasdsad", "sdaasdas"));
		
		return stList;
	}

	@Override
	public int update(Student st) {
		query = "UPDATE student SET fName = ?, lName=?, email=? where id = ?";
		int i=0;
		try {
			connect();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, st.fName);
			pstmt.setString(2, st.lName);
			pstmt.setString(3, st.email);
			pstmt.setInt(4, st.id);
			i=pstmt.executeUpdate();
			disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int delete(int id) {
		query = "DELETE FROM student WHERE id=?";
		int i=0;
		connect();
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			i = pstmt.executeUpdate();
			disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	

}
