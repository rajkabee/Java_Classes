package com.example.swingProject.frames;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameClassExample {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);

	}

	public static class MyFrame extends JFrame {
		public MyFrame() {
			setTitle("Dursikshya");
			setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// frame.setSize(800, 500);
			setBounds(200, 100, 800, 500);
		}

	}

}
