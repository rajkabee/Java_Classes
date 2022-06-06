package com.example.swingProject.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Panel Example");
		frame.setBounds(200, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		MyPanel panel = new MyPanel();
		frame.add(panel, BorderLayout.NORTH);
		frame.add(new StudentForm(), BorderLayout.CENTER);
		frame.setVisible(true);

	}

	static class MyPanel extends JPanel {
		public MyPanel() {

			setBackground(Color.GRAY);
			// setBounds(0, 0, 400, 200);
			JLabel header = new JLabel("Product Form");
			header.setBounds(100, 0, 200, 40);
			setLayout(null);
			header.setFont(new Font("Vladimir script", Font.PLAIN, 30));
			header.setForeground(Color.WHITE);
			add(header);

			JLabel productNameLabel = new JLabel("Product Name: ");
			productNameLabel.setBounds(50, 40, 100, 30);
			add(productNameLabel);

		}
	}

	static class StudentForm extends JPanel {
		public StudentForm() {
			setLayout(null);
			JLabel title = new JLabel("Student's Form");
			title.setBounds(320, 10, 300, 30);
			title.setFont(new Font("Verdana", Font.PLAIN, 24));
			add(title);
			JLabel fNameLabel = new JLabel("First Name: ");
			fNameLabel.setBounds(200, 50, 150, 20);
			add(fNameLabel);
			JTextField fNameField = new JTextField();
			fNameField.setBounds(400, 50, 250, 20);
			add(fNameField);
			JLabel lNameLabel = new JLabel("Last Name: ");
			lNameLabel.setBounds(200, 80, 150, 20);
			add(lNameLabel);
			JTextField lNameField = new JTextField();
			lNameField.setBounds(400, 80, 250, 20);
			add(lNameField);
			JLabel emailLabel = new JLabel("Email: ");
			emailLabel.setBounds(200, 110, 150, 20);
			add(emailLabel);
			JTextField emailField = new JTextField();
			emailField.setBounds(400, 110, 250, 20);
			add(emailField);
			JButton submitButton = new JButton("Submit");
			submitButton.setBackground(Color.BLUE);
			submitButton.setForeground(Color.WHITE);
			submitButton.setFont(new Font("Verdana", Font.PLAIN, 18));
			submitButton.setBounds(200, 140, 450, 30);
			add(submitButton);

//			submitButton.addActionListener(e -> {
//				Student st = new Student();
//				st.setfName(fNameField.getText());
//				st.setlName(lNameField.getText());
//				st.setEmail(emailField.getText());
//				StudentDao sDao = new StudentDao(
//									"jdbc:mysql://localhost:3306/dursikshya",
//									"root",
//									"root"
//									);
//				try {
//					int i = sDao.save(st);
//					if(i==1) {
//						System.out.println("Saved");
//					}
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//					System.out.println("Failed");
//				}
//			});
		}
	}

}
