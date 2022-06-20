package com.example.swingApp;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ToolBar extends JMenuBar {
	JFrame frame;

	public ToolBar(JFrame frame) {
		this.frame = frame;
		JMenuItem home = new JMenuItem("Home");
		JMenuItem products = new JMenuItem("Products");
		JMenuItem purchase = new JMenuItem("Purchase");
		JMenuItem sales = new JMenuItem("Sales");
		JMenuItem contact = new JMenuItem("Contact");
		JMenuItem aboutUs = new JMenuItem("About Us");
		JMenuItem help = new JMenuItem("Help");
		JMenu services = new JMenu("Services");
		services.add(purchase);
		services.add(sales);
		services.add(new JMenuItem("Finance"));
		add(home);
		add(products);
		add(services);
		add(contact);
		add(aboutUs);
		add(help);

	}
}
