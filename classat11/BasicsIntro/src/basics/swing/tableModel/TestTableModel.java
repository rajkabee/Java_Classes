package basics.swing.tableModel;
import java.awt.BorderLayout;
import java.awt.Point;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class TestTableModel {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Sparse Test");
        String headers[] = { "English", "Japanese" };
        TableModel model = new SparseTableModel(10, headers);
        JTable table = new JTable(model);

        model.setValueAt("one", 0, 0);
        model.setValueAt("ten", 9, 0);
        model.setValueAt("roku - \u516D", 5, 1);
        model.setValueAt("hachi - \u516B", 8, 1);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}

class SparseTableModel extends AbstractTableModel {

    private Hashtable lookup;

    private final int rows;

    private final int columns;

    private final String headers[];

    public SparseTableModel(int rows, String columnHeaders[]) {
        if ((rows < 0) || (columnHeaders == null)) {
            throw new IllegalArgumentException("Invalid row count/columnHeaders");
        }
        this.rows = rows;
        this.columns = columnHeaders.length;
        headers = columnHeaders;
        lookup = new Hashtable();
    }

    public int getColumnCount() {
        return columns;
    }

    public int getRowCount() {
        return rows;
    }

    public String getColumnName(int column) {
        return headers[column];
    }

    public Object getValueAt(int row, int column) {
        return lookup.get(new Point(row, column));
    }

    public void setValueAt(Object value, int row, int column) {
        if ((rows < 0) || (columns < 0)) {
            throw new IllegalArgumentException("Invalid row/column setting");
        }
        if ((row < rows) && (column < columns)) {
            lookup.put(new Point(row, column), value);
        }
    }
}