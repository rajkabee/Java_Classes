package basics.swing.tableModelExample;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import basics.swing.model.Student;
import basics.swing.model.StudentDao;
public class StudentJTable extends JFrame implements ActionListener {
		   private StudentTableModel tableModel;
		   private JTable table;
		   private ArrayList<Student> myList;
		   JButton button = new JButton();
		   public StudentJTable(String title) throws SQLException {
		      super(title);
		      setBounds(10,10,400,300);
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      myList = new StudentDao("jdbc:mysql://localhost:3306/dursikshya", "root", "root").getAll();
		      tableModel = new StudentTableModel(myList);
		      table = new JTable(tableModel);
		      
		      table.getColumn("Action").setCellRenderer(new ButtonRenderer());
		      table.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox()));
		      
		      //table.setAutoCreateRowSorter(true);
		      JScrollPane scrollPane = new JScrollPane(table);
		      scrollPane.setPreferredSize(new Dimension(380,280));
		      JPanel panel = new JPanel();
		      panel.setLayout(new BorderLayout());
		      panel.add(scrollPane,BorderLayout.CENTER);
		      getContentPane().add(panel);
		      button.addActionListener(
		    	      new ActionListener()
		    	      {
		    	        public void actionPerformed(ActionEvent event)
		    	        {
		    	        	
		    	        	JOptionPane.showMessageDialog(null,"Do you want to modify this line?");
		    	        }
		    	      }
		    	    );
		   }
		   public void actionPerformed(ActionEvent ae) {

		   }
		   
		   class ButtonRenderer extends JButton implements TableCellRenderer 
		   {
		     public ButtonRenderer() {
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
		     
		     public ButtonEditor(JCheckBox checkBox)
		     {
		       super(checkBox);
		     }
		     public Component getTableCellEditorComponent(JTable table, Object value,
		     boolean isSelected, int row, int column) 
		     {
		       label = (value == null) ? "Delete" : value.toString();
		       button.setText(label);
		       return button;
		     }
		     public Object getCellEditorValue() 
		     {
		       return new String(label);
		     }
		   }
		   public static void main(String[] args) throws SQLException {
		      StudentJTable myApp = new StudentJTable("Custom JTable");
		      myApp.setVisible(true);
		   }
		}

