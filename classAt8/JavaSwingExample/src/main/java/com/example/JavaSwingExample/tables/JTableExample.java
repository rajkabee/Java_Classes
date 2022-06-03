package com.example.JavaSwingExample.tables;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.example.JavaSwingExample.model.Product;

public class JTableExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JTable Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 100, 800, 500);
		String[] columns = {"Sn.", "Product Name", "Manufacturer", "Description","Price","Is Available"};
		String[][] products = {
				{"1", "Mouse", "Dell", "Optical wireless", "600", "Yes"},
				{"2", "Keyboard", "Dell", "Mechanical Wireless", "2400", "Yes"},
				{"3", "Monitor", "MSI", "25inches 4K", "27000", "Yes"}
		};
		JTable table = new JTable(products,columns); 
		//frame.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
		
		
		//frame.pack();
		frame.setVisible(true);
	}
	
}
