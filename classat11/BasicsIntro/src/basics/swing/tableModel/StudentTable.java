package basics.swing.tableModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import basics.swing.model.Student;
import basics.swing.model.StudentDao;

public class StudentTable {
	public static void main(String[] args) throws SQLException {
		JFrame frame = new JFrame("Table");
		frame.setBounds(200,100,400,400);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ArrayList<Student> stList = new StudentDao(
				"jdbc:mysql://localhost:3306/dursikshya",
				"root",
				"root")
				.getAll();
		StudentTableModel tableModel = new StudentTableModel(stList);
		JTable table = new JTable(tableModel);
		
		frame.add(table);
		frame.setVisible(true);
	}
	
	
	@SuppressWarnings("serial")
	public class StudentTableModel extends DefaultTableModel {
		
		private List<Student> students ;
		  private String[] columns = {"Id","Name", "Email"};

		  public StudentTableModel(List<Student> students){
		    super();
		    this.students = students;
		    columns = new String[]{"Id","Name", "Email"};
		  }


		}

}
