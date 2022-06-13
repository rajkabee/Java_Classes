package com.example.gui.tables;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.example.gui.model.Product;
import com.example.gui.model.ProductDao;

public class ProductTableFrame extends JFrame {

	public ProductTableFrame() throws SQLException {
		setTitle("Products Table");
		setBounds(300, 100, 600, 500);
		setDefaultCloseOperation(3);
		String[] col = { "Id", "Product Name", "Manufacturer", "Description", "Price", "Is Available" };
		ProductDao dao = new ProductDao();
		ArrayList<Product> productList = dao.getAll();
		int num = productList.size();
		String[][] products = new String[num][6];
		int i = 0;
		for (Product p : productList) {
			products[i] = p.productToArray();
			i++;
		}
		System.out.println(products);
		JTable table = new JTable(products, col);
		table.setBounds(0, 0, 600, 400);
		add(table);
		JScrollPane tablePane = new JScrollPane(table);
		add(tablePane);

	}

	public static void main(String[] args) throws SQLException {
		ProductTableFrame frame = new ProductTableFrame();
		frame.setVisible(true);
	}

}
