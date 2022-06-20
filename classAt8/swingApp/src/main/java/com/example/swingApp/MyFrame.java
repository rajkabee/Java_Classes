package com.example.swingApp;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("Dursikshya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 800, 500);
		setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		Content content = new Content();
		add(content);
		setJMenuBar(new ToolBar(this));
		setVisible(true);
	}
}
