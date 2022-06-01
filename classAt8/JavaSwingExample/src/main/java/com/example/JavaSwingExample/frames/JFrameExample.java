package com.example.JavaSwingExample.frames;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) throws IOException {
		JFrame frame  = new JFrame();
		frame.setTitle("My Frame");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 150, 600, 400);
		//frame.setSize(600, 400);
		//frame.pack();
		frame.setIconImage(ImageIO.read(new File("res/icon.png")));
		frame.setVisible(true);
	}
}
