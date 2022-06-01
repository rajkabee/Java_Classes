package core.jdbc.usingDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao extends AbstractDao<Student> {

	PreparedStatement pstm;
	String query;
	ResultSet rs;

	@Override
	public int save(Student st) throws SQLException {
		connect();
		query = "INSERT INTO student (fName, lName, email) values(?,?,?)";
		pstm = con.prepareStatement(query);
		pstm.setString(1, st.getfName());
		pstm.setString(2, st.getlName());
		pstm.setString(3, st.getEmail());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Student getOne(int id) throws SQLException {
		connect();
		query = "SELECT * FROM student WHERE id=?";
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		rs = pstm.executeQuery();
		if (rs.next()) {
			Student st = new Student(rs.getInt("id"), rs.getString("fName"), rs.getString("lName"),
					rs.getString("email"));
			disconnect();
			return st;
		}
		disconnect();
		return null;
	}

	@Override
	public ArrayList<Student> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Student t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
