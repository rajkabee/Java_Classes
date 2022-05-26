package OracleJTableExample;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumn;

public class SimpleTableDemo2 extends JPanel{
	public SimpleTableDemo2() {
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
		
		final JTable table = new JTable(data, columnNames);
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
        //table.setSelectionMode(1);
        //table.setRowSelectionAllowed(false);
        //table.setColumnSelectionAllowed(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
	}
	public static void createAndShowGUI() {
		JFrame frame = new JFrame("Simple Table Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SimpleTableDemo2 newContentPane = new SimpleTableDemo2();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		
		frame.pack();
		frame.setVisible(true);
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
