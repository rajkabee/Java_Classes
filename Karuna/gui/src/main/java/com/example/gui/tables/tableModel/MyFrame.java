package com.example.gui.tables.tableModel;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.example.gui.model.Product;
import com.example.gui.model.ProductDao;

public class MyFrame extends JFrame {
	public MyFrame() throws SQLException {
		ArrayList<Product> products = new ProductDao().getAll();
		ProductTableModel model = new ProductTableModel(products);
		JTable table = new JTable(model);
		JScrollPane tablePane = new JScrollPane(table);
		tablePane.setSize(600, 400);
		add(tablePane);
		pack();
	}

	public static void main(String[] args) throws SQLException {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
	}
}
