package com.example.JavaSwingExample.jmenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JMenuExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JMenu Example");
		JMenu home = new JMenu("Home");
		JMenu product = new JMenu("Products");
		JMenu beds = new JMenu("Beds");
		JMenu sofas = new JMenu("Sofas");
		JMenu cupboards = new JMenu("Cupboards");
		product.add(beds);
		product.add(sofas);
		product.add(cupboards);
		JMenu help = new JMenu("Help");
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(home);
		menuBar.add(product);
		menuBar.add(help);
		frame.setJMenuBar(menuBar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 100, 600, 400);
		frame.setVisible(true);
		
	}
}
