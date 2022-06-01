package com.example.JavaSwingExample.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelExample {
	public static void main(String[] args) throws IOException {
		JFrame frame  = new JFrame();
		frame.setTitle("My Frame");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 150, 600, 400);
		//frame.setSize(600, 400);
		//frame.pack();
		frame.setIconImage(ImageIO.read(new File("res/icon.png")));
		frame.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 600, 200);
		panel.setBackground(Color.DARK_GRAY);
		frame.add(panel, new BorderLayout().NORTH);
		
		
		frame.setVisible(true);
	}
}
