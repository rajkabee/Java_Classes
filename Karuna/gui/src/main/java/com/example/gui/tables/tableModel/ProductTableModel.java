package com.example.gui.tables.tableModel;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.example.gui.model.Product;

public class ProductTableModel extends DefaultTableModel {
	String[] cols = { "Id", "Product Name", "Manufacturer", "Description", "Price", "Is Available", "Actions" };
	private ArrayList<Product> myList;

	public ProductTableModel(ArrayList<Product> stList) {
		myList = stList;
	}

	public int getColumnCount() {
		return cols.length;
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
		} else if (col == 5) {
			temp = myList.get(row).isInStock();
		}

		return temp;
	}

	// needed to show column names in JTable
	public String getColumnName(int col) {
		return cols[col];
	}

	public Class getColumnClass(int col) {
		if (col == 0) {
			return Integer.class;
		} else if (col == 4) {
			return Float.class;
		} else if (col == 5) {
			return Boolean.class;
		} else {
			return String.class;
		}
	}
}
