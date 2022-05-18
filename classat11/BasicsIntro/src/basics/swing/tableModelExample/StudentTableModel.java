package basics.swing.tableModelExample;

import javax.swing.table.AbstractTableModel;

import basics.swing.model.Student;

import java.util.ArrayList;

public class StudentTableModel extends AbstractTableModel {
	   private String[] columnNames = {"Id","First Name","Last Name", "Email", "Action"};
	   private ArrayList<Student> myList;
	   public StudentTableModel(ArrayList<Student> stList) {
	      myList = stList;
	   }
	   public int getColumnCount() {
	      return columnNames.length;
	   }
	   public int getRowCount() {
	      int size;
	      if (myList == null) {
	         size = 0;
	      }
	      else {
	         size = myList.size();
	      }
	      return size;
	   }
	   public Object getValueAt(int row, int col) {
	      Object temp = null;
	      if (col == 0) {
	         temp = myList.get(row).getId();
	      }
	      else if (col == 1) {
	         temp = myList.get(row).getfName();
	      }
	      else if (col == 2) {
	         temp = myList.get(row).getlName();
	      }
	      else if (col == 3) {
		         temp = myList.get(row).getEmail();
		      }
	      return temp;
	   }
	   // needed to show column names in JTable
	   public String getColumnName(int col) {
	      return columnNames[col];
	   }
	   public Class getColumnClass(int col) {
	      if (col == 0) {
	         return Integer.class;
	      }
	      else {
	         return String.class;
	      }
	   }
	}

