package com.example.JavaSwingExample.tables;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.example.JavaSwingExample.model.Product;

public class ObjectsToTable {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JTable Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 100, 400, 500);
		String[] columns = { "Sn.", "Product Name", "Manufacturer", "Description", "Price", "Is Available" };
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Mouse", "Dell", "Optical wireless", 600f, true));
		products.add(new Product(2, "Keyboard", "Dell", "Mechanical Wireless", 2400f, true));
		products.add(new Product(3, "Monitor", "MSI", "25inches 4K", 27000f, true));

		TableModel model = new TableModel(products, columns);

		JTable table = new JTable(model);
		// frame.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane);

		// frame.pack();
		frame.setVisible(true);
	}

	public static class TableModel extends DefaultTableModel {
		private String[] columnNames;
		private ArrayList<Product> myList;

		public TableModel(ArrayList<Product> products, String[] columns) {
			this.columnNames = columns;
			this.myList = products;

		}

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			int size;
			if (myList == null) {
				size = 0;
			} else {
				size = myList.size();
			}
			return size;
		}

		public Object getValueAt(int row, int col) {
			Object temp = null;
			if (col == 0) {
				temp = myList.get(row).getProductId();
			} else if (col == 1) {
				temp = myList.get(row).getProductName();
			} else if (col == 2) {
				temp = myList.get(row).getBrand();
			} else if (col == 3) {
				temp = myList.get(row).getDescription();
			} else if (col == 4) {
				temp = myList.get(row).getPrice();
			} else if (col == 3) {
				temp = myList.get(row).isInStock();
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
			} else if (col == 4) {
				return Float.class;
			} else if (col == 5) {
				return boolean.class;
			} else {
				return String.class;
			}
		}
	}

}
