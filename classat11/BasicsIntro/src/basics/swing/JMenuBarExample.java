package basics.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("JFrame Title");
		frame.setBounds(200, 100, 800, 500);
		frame.setLayout(new BorderLayout());
		frame.setIconImage(Toolkit.getDefaultToolkit()
								.getImage("resources/messangerIcon.jpg"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		JMenuItem home = new JMenuItem("Home");
		JMenuItem products = new JMenuItem("Products");
		JMenu services = new JMenu("Services");
		JMenuItem sales = new JMenuItem("Sales");
		JMenuItem purchase = new JMenuItem("Purchase");
		JMenuItem finance = new JMenuItem("Finance");
		services.add(sales);
		services.add(purchase);
		services.add(finance);
		
		menuBar.add(home);
		menuBar.add(products);
		menuBar.add(services);
		menuBar.setLayout(new FlowLayout(0));
		frame.setJMenuBar(menuBar);
		StudentForm form = new StudentForm();
		frame.add(form, BorderLayout.CENTER);
		
		
		
		frame.setVisible(true);
		
	}
}
