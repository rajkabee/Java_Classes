package basics.swing;


import java.awt.Toolkit;

import javax.swing.JFrame;

public class SwingIntro {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("My JFrame");
		myFrame.setTitle("JFrame Title");
		//myFrame.setSize(800, 500);
		myFrame.setBounds(200, 100, 800, 500);
		myFrame.setIconImage(Toolkit.getDefaultToolkit()
								.getImage("resources/messangerIcon.jpg"));
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
	}
}
