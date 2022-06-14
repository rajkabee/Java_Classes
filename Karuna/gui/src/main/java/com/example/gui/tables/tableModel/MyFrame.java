package com.example.gui.tables.tableModel;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import com.example.gui.model.Product;
import com.example.gui.model.ProductDao;

public class MyFrame extends JFrame {
	JButton button = new JButton();

	public MyFrame() throws SQLException {
		ArrayList<Product> products = new ProductDao().getAll();
		ProductTableModel model = new ProductTableModel(products);
		JTable table = new JTable(model);
		table.getColumn("Actions").setCellRenderer(new ButtonRenderer());
		table.getColumn("Actions").setCellEditor(new ButtonEditor(new JCheckBox()));
		JScrollPane tablePane = new JScrollPane(table);
		tablePane.setSize(600, 400);
		add(tablePane);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// JOptionPane.showMessageDialog(null, "Do you want to modify this line?");

			}
		});
		pack();
	}

	class ButtonRenderer extends JButton implements TableCellRenderer {
		public ButtonRenderer() {
			setOpaque(true);
		}

		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			setText((value == null) ? "Modify" : value.toString());
			return this;
		}
	}

	class ButtonEditor extends DefaultCellEditor {
		private String label;

		public ButtonEditor(JCheckBox checkBox) {
			super(checkBox);
		}

		public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
				int column) {
			label = (value == null) ? "Modify" : value.toString();
			button.setText(label);
			return button;
		}

		public Object getCellEditorValue() {
			return new String(label);
		}
	}

	public static void main(String[] args) throws SQLException {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
	}
}
