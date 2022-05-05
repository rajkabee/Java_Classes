package swingUi.practice;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameExample2 {
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Mario");
	}
	
	public static class MyFrame extends JFrame{
		public MyFrame(String title) {
			setTitle(title);
			setBounds(200, 100, 800, 500);
			setIconImage(Toolkit.getDefaultToolkit().getImage("res/insta.png"));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
		}
		
		
	}
	
	
}
