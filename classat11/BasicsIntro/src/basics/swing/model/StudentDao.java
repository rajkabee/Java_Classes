package basics.swing.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao extends AbstractDao<Student> {
	String query;
	PreparedStatement pstm;
	int id, i;
	ResultSet rs;
	
	
	
	public StudentDao(String url, String user, String pass) {
		super.url = url;
		super.user = user;
		super.pass = pass;
	}

	@Override
	public int save(Student st) throws SQLException {
		connect();
		query = "INSERT INTO student (fName, lName, email) VALUES (?,?,?)";
		pstm = con.prepareStatement(query);
		pstm.setString(1, st.getfName());
		pstm.setString(2, st.getlName());
		pstm.setString(3, st.getEmail());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Student getOne(int id) throws SQLException {
		connect();
		query = "Select * FROM student WHERE id = ?";
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		rs = pstm.executeQuery();
		Student st = new Student();
		if(rs.next()) {
			st.setId(rs.getInt("id"));
			st.setfName(rs.getString("fName"));
			st.setlName(rs.getString("lName"));
			st.setEmail(rs.getString("email"));
		}
		disconnect();
		return st;
	}

	@Override
	public ArrayList<Student> getAll() throws SQLException {
		connect();
		query = "Select * FROM student";
		pstm = con.prepareStatement(query);
		rs = pstm.executeQuery();
		ArrayList<Student> stList = new ArrayList<>();
		while(rs.next()) {
			Student st = new Student();
			st.setId(rs.getInt("id"));
			st.setfName(rs.getString("fName"));
			st.setlName(rs.getString("lName"));
			st.setEmail(rs.getString("email"));
			stList.add(st);
		}
		disconnect();
		return stList;
	}

	@Override
	public int update(Student st) throws SQLException {
		connect();
		query = "UPDATE student set fName=?, lName=?, email=? WHERE id=?";
		pstm = con.prepareStatement(query);
		pstm.setString(1, st.getfName());
		pstm.setString(2, st.getlName());
		pstm.setString(3, st.getEmail());
		pstm.setInt(4, st.getId());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(int id) throws SQLException {
		connect();
		query = "DELETE FROM student WHERE id=?";
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	

}
