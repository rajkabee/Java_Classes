package OracleJTableExample;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class SimpleTableDemo3 extends JPanel implements TableModelListener{
	public SimpleTableDemo3() {
		
		MyTableModel model = new MyTableModel();
		final JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        TableColumn column = null;
        for (int i = 0; i < 5; i++) {
            column = table.getColumnModel().getColumn(i);
            if (i == 2) {
                column.setPreferredWidth(100); //third column is bigger
            } else {
                column.setPreferredWidth(50);
            }
        }
        table.getModel().addTableModelListener(this);
        //table.setSelectionMode(1);
        //table.setRowSelectionAllowed(false);
        //table.setColumnSelectionAllowed(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
	}
	public static void createAndShowGUI() {
		JFrame frame = new JFrame("Simple Table Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SimpleTableDemo3 newContentPane = new SimpleTableDemo3();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	
	class MyTableModel extends AbstractTableModel {
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};

		Object[][] data = {
		{"Kathy", "Smith",
		"Snowboarding", 5, false},
		{"John", "Doe",
		"Rowing", 3, true},
		{"Sue", "Black",
		"Knitting", 2, false},
		{"Jane", "White",
		"Speed reading", 20, true},
		{"Joe", "Brown",
		"Pool", 10,false}
		};
		
	    public int getColumnCount() {
	        return columnNames.length;
	    }

	    public int getRowCount() {
	        return data.length;
	    }

	    public String getColumnName(int col) {
	        return columnNames[col];
	    }

	    public Object getValueAt(int row, int col) {
	        return data[row][col];
	    }

	    public Class getColumnClass(int c) {
	        return getValueAt(0, c).getClass();
	    }



	    public boolean isCellEditable(int row, int col) {
	        if (col < 2) {
	            return false;
	        } else {
	            return true;
	        }
	    }

	    public void setValueAt(Object value, int row, int col) {
	        data[row][col] = value;
	        fireTableCellUpdated(row, col);
	    }
	    
	}
	
	public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);

        ...// Do something with the data...
    }
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				createAndShowGUI();
			}
			
		});
	}
	
}
