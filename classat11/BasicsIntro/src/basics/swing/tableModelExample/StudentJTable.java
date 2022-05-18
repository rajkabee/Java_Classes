package basics.swing.tableModelExample;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import basics.swing.model.Student;
import basics.swing.model.StudentDao;
public class StudentJTable extends JFrame implements ActionListener {
		   private StudentTableModel tableModel;
		   private JTable table;
		   private ArrayList<Student> myList;
		   public StudentJTable(String title) throws SQLException {
		      super(title);
		      setBounds(10,10,400,300);
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      myList = new StudentDao("jdbc:mysql://localhost:3306/dursikshya", "root", "root").getAll();
		      tableModel = new StudentTableModel(myList);
		      table = new JTable(tableModel);
		      table.setAutoCreateRowSorter(true);
		      JScrollPane scrollPane = new JScrollPane(table);
		      scrollPane.setPreferredSize(new Dimension(380,280));
		      JPanel panel = new JPanel();
		      panel.add(scrollPane);
		      add(panel,BorderLayout.CENTER);
		   }
		   public void actionPerformed(ActionEvent ae) {

		   }
//		   public static void main(String[] args) throws SQLException {
//		      StudentJTable myApp = new StudentJTable("Custom JTable");
//		      myApp.setVisible(true);
//		   }
		}

