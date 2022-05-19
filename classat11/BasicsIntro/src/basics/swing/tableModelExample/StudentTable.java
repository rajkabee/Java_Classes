package basics.swing.tableModelExample;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import basics.swing.model.Student;
import basics.swing.model.StudentDao;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

public class StudentTable extends JPanel{
	   private StudentTableModel tableModel;
	   private JTable table;
	   private ArrayList<Student> myList;
	   JButton button = new JButton();
	   public StudentTable(String title) throws SQLException {
		   StudentDao sDao = new StudentDao("jdbc:mysql://localhost:3306/dursikshya", "root", "root");
	      myList = sDao.getAll();
	      tableModel = new StudentTableModel(myList);
	      table = new JTable(tableModel);
	      table.setAutoCreateRowSorter(true);
	      int i=0;
	      for(Student st : myList) {
	    	  ButtonRenderer deleteBtn = new ButtonRenderer("Delete");
	    	  deleteBtn.addActionListener(e->{
	    		  JOptionPane.showMessageDialog(null,"Do you want to modify this line?");
	    		  try {
					sDao.delete(st.getId());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
	    	  });
//	    	  deleteBtn.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					try {
//						
//					} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//					
//				}
//			});
	    	  
	    	table.getColumn("Action").setCellRenderer(deleteBtn);
	        table.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(), "Delete"));
	    	i++;
	      }
	      
	      JScrollPane scrollPane = new JScrollPane(table);
	      scrollPane.setPreferredSize(new Dimension(580,150));
	      add(scrollPane);
	   }
	   
	   class ButtonRenderer extends JButton implements TableCellRenderer 
	   {
	     public ButtonRenderer(String text) {
	    	 setText(text);
	       setOpaque(true);
	     }
	     public Component getTableCellRendererComponent(JTable table, Object value,
	     boolean isSelected, boolean hasFocus, int row, int column) {
	       setText((value == null) ? "Delete" : value.toString());
	       return this;
	     }
	   }
	   
	   class ButtonEditor extends DefaultCellEditor 
	   {
	     private String label;
	     
	     public ButtonEditor(JCheckBox checkBox, String label)
	     {
	       super(checkBox);
	       this.label = label;
	     }
	     public Component getTableCellEditorComponent(JTable table, Object value,
	     boolean isSelected, int row, int column) 
	     {
	       //label = (value == null) ? "Modify" : value.toString();
	       button.setText(label);
	       return button;
	     }
	     public Object getCellEditorValue() 
	     {
	       return new String(label);
	     }
	   }
	   
	

	}
