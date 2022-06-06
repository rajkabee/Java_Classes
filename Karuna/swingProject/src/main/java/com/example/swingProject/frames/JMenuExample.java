package com.example.swingProject.frames;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Dursikshya");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(800, 500);

		JMenuItem home = new JMenuItem("Home");
		// home.setHorizontalAlignment(SwingConstants.LEFT);
		JMenuItem products = new JMenuItem("Products");
		// products.setHorizontalAlignment(SwingConstants.LEFT);
		JMenuItem contact = new JMenuItem("Contact Us");
		// contact.setHorizontalAlignment(SwingConstants.LEFT);
		JMenuItem about = new JMenuItem("About Us");
		// about.setHorizontalAlignment(SwingConstants.LEFT);
		JMenuItem purchase = new JMenuItem("Purchase");
		JMenuItem sales = new JMenuItem("Sales");

		JMenu services = new JMenu("Services");
		services.add(purchase);
		services.add(sales);

		JMenuBar menuBar = new JMenuBar();
		menuBar.add(home);
		menuBar.add(products);
		menuBar.add(services);
		menuBar.add(contact);
		menuBar.add(about);
		// menuBar.setAlignmentX(2);
		// menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		frame.setJMenuBar(menuBar);
		frame.setLayout(null);
		frame.setBounds(200, 100, 800, 500);
		frame.setVisible(true);
	}
}
