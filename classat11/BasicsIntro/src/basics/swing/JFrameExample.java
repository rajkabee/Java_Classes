package basics.swing;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Messenger");
	}
	public static class MyFrame extends JFrame{
		public MyFrame(String title) {
			setTitle(title);
			setBounds(200,100,700,500);
			setIconImage(Toolkit.getDefaultToolkit().getImage("resources/messanger.jpg"));
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		}
	}
}
