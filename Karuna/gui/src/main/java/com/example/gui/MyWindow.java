package com.example.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 600, 500);
		setLayout(new BorderLayout());
		FormPanel panel = new FormPanel();
		add(panel, BorderLayout.CENTER);

	}
}
