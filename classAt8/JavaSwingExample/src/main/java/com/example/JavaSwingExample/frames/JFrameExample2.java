package com.example.JavaSwingExample.frames;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameExample2 extends JFrame{

	public JFrameExample2() throws IOException {
		setTitle("My Frame");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 600, 400);
		setIconImage(ImageIO.read(new File("res/icon.png")));
	}
	
	public static void main(String[] args) throws IOException {
		JFrame myFrame = new JFrameExample2();
		myFrame.setVisible(true);
	}
	
}
