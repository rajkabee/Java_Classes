package basics.swing.studentManagement;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import basics.swing.model.Student;
import basics.swing.model.StudentDao;

public class StudentsTableFrame extends JFrame{
	JButton button = new JButton("Button");
	public StudentsTableFrame() throws SQLException {
		setBounds(200,100,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		String[] columns = {"id", "Name", "Email", "Action"};
		DefaultTableModel model = new DefaultTableModel(columns, 0);
		ArrayList<Student> stList =new StudentDao("jdbc:mysql://localhost:3306/dursikshya", "root", "root").getAll();
	    for(Student st : stList) {
	    	Object[] row  = {
	    			st.getId(),
	    			st.getfName()+st.getlName(),
	    			st.getEmail()
	    	};
	    	model.addRow(row);
	    }
	     
		
		JTable table = new JTable(model);
		table.getColumn("Action").setCellRenderer(new ButtonRenderer());
	    table.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox()));
	     
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		add(scrollPane, BorderLayout.CENTER);
		
		
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
		StudentsTableFrame frame = new StudentsTableFrame();
		frame.setVisible(true);
	}
}
