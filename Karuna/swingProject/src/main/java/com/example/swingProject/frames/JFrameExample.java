package com.example.swingProject.frames;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Dursikshya");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(800, 500);
		frame.setBounds(200, 100, 800, 500);

		frame.setVisible(true);
	}
}
