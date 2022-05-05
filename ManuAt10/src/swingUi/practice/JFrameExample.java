package swingUi.practice;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("My Frame");
		//myFrame.setTitle("JFrame");
		//myFrame.setSize(500, 400);
		myFrame.setBounds(200, 100, 600, 400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBackground(Color.MAGENTA);
		myFrame.setForeground(Color.GREEN);
		Image icon = Toolkit.getDefaultToolkit().getImage("res/insta.png"); 
		myFrame.setIconImage(icon);
		myFrame.setVisible(true);
	
		
	}
}
