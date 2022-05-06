package swingUi.practice;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuExample {
	
		public JMenuExample() {
			JFrame myFrame = new JFrame("JMenu Example");
			JMenuBar menuBar;
			JMenu menu, subMenu;
			menuBar = new JMenuBar();
			menu = new JMenu("Menu");
			subMenu = new JMenu("Services");
			JMenuItem home = new JMenuItem("Home");
			JMenuItem products = new JMenuItem("Products");
			JMenuItem contacts = new JMenuItem("Contacts");
			JMenuItem users = new JMenuItem("Users");
			JMenuItem help = new JMenuItem("Help");
			JMenuItem sales = new JMenuItem("Sales");
			JMenuItem purchase = new JMenuItem("Purchase");
			JMenuItem logistics = new JMenuItem("Logistics");
			
			menu.add(home);
			menu.add(products);
			menu.add(contacts);
			menu.add(users);
			menu.add(help);
			
			subMenu.add(sales);
			subMenu.add(purchase);
			subMenu.add(logistics);
			menu.add(subMenu);
			
			menuBar.add(menu);
			myFrame.setJMenuBar(menuBar);
			myFrame.setBounds(200,100,800,500);
			myFrame.setLayout(null);
			myFrame.setVisible(true);
		}
		
	public static void main(String[] args) {
		new JMenuExample();
	}
}
