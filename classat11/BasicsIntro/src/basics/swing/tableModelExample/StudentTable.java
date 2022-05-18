package basics.swing.tableModelExample;

import javax.swing.JTable;

import basics.swing.model.Student;
import basics.swing.model.StudentDao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class StudentTable extends JPanel{
	   private StudentTableModel tableModel;
	   private JTable table;
	   private ArrayList<Student> myList;
	   public StudentTable(String title) throws SQLException {
	      
	      myList = new StudentDao("jdbc:mysql://localhost:3306/dursikshya", "root", "root").getAll();
	      tableModel = new StudentTableModel(myList);
	      table = new JTable(tableModel);
	      table.setAutoCreateRowSorter(true);
	      JScrollPane scrollPane = new JScrollPane(table);
	      scrollPane.setPreferredSize(new Dimension(580,150));
	      add(scrollPane);
	   }
	

	}
