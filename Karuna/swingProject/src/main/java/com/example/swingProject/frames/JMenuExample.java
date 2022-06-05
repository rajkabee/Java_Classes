package com.example.swingProject.frames;

import java.awt.ComponentOrientation;
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
		frame.setBounds(200, 100, 800, 500);
		JMenuItem home = new JMenuItem("Home");
		JMenuItem products = new JMenuItem("Products");
		JMenuItem contact = new JMenuItem("Contact Us");
		JMenuItem about = new JMenuItem("About Us");
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
		// menuBar.setLayout();
		menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		frame.setJMenuBar(menuBar);

		frame.setVisible(true);
	}
}
