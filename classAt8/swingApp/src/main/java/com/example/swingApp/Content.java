package com.example.swingApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Content extends JPanel implements ActionListener {
	private String gender;
	JTextField fNameField = new JTextField();
	JTextField lNameField = new JTextField();
	JTextField emailField = new JTextField();
	JRadioButton maleRadio = new JRadioButton("Male");
	JRadioButton femaleRadio = new JRadioButton("Female");
	JRadioButton othersRadio = new JRadioButton("Others");
	ButtonGroup genderBtnGrp = new ButtonGroup();
	JTextField ageField = new JTextField();
	JTextField usernameField = new JTextField();
	JPasswordField passwordField = new JPasswordField();

	public Content() {
		setSize(800, 400);
		setBackground(Color.GRAY);
		setForeground(Color.WHITE);
		setLayout(null);

		JLabel formHeader = new JLabel("Form Header");
		formHeader.setForeground(Color.WHITE);
		formHeader.setFont(new Font("Verdana", Font.BOLD, 40));
		formHeader.setBounds(250, 20, 400, 50);
		add(formHeader);

		JLabel fNameLabel = new JLabel("First Name: ");
		JLabel lNameLabel = new JLabel("Last Name: ");
		JLabel emailLabel = new JLabel("Email: ");
		JLabel genderLabel = new JLabel("Gender: ");
		JLabel ageLabel = new JLabel("Age: ");
		JLabel usernameLabel = new JLabel("Username: ");
		JLabel passwordLabel = new JLabel("Password: ");

		fNameLabel.setBounds(200, 80, 150, 20);
		lNameLabel.setBounds(200, 110, 150, 20);
		emailLabel.setBounds(200, 140, 150, 20);
		genderLabel.setBounds(200, 170, 150, 20);
		ageLabel.setBounds(200, 200, 150, 20);
		usernameLabel.setBounds(200, 230, 150, 20);
		passwordLabel.setBounds(200, 260, 150, 20);

		add(fNameLabel);
		add(lNameLabel);
		add(emailLabel);
		add(genderLabel);
		add(ageLabel);
		add(usernameLabel);
		add(passwordLabel);

		genderBtnGrp.add(maleRadio);
		genderBtnGrp.add(femaleRadio);
		genderBtnGrp.add(othersRadio);

		fNameField.setBounds(350, 80, 250, 20);
		lNameField.setBounds(350, 110, 250, 20);
		emailField.setBounds(350, 140, 250, 20);
		maleRadio.setBounds(350, 170, 80, 20);
		maleRadio.addActionListener(this);
		maleRadio.setBackground(Color.GRAY);
		femaleRadio.setBounds(435, 170, 80, 20);
		femaleRadio.addActionListener(this);
		femaleRadio.setBackground(Color.GRAY);
		othersRadio.setBounds(520, 170, 80, 20);
		othersRadio.addActionListener(this);
		othersRadio.setBackground(Color.GRAY);
		ageField.setBounds(350, 200, 250, 20);
		usernameField.setBounds(350, 230, 250, 20);
		passwordField.setBounds(350, 260, 250, 20);

		add(fNameField);
		add(lNameField);
		add(emailField);
		add(maleRadio);
		add(femaleRadio);
		add(othersRadio);
		add(ageField);
		add(usernameField);
		add(passwordField);
		JButton submitBtn = new JButton("Submit");
		submitBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				User user = new User(fNameField.getText(), lNameField.getText(), emailField.getText(), gender,
						ageField.getText(), usernameField.getText(), passwordField.getPassword().toString());
				Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
				Session session = con.buildSessionFactory().openSession();
				Transaction tx = session.beginTransaction();
				session.save(user);
				tx.commit();
				session.close();

			}
		});
		submitBtn.setBounds(300, 300, 200, 30);
		submitBtn.setBackground(new Color(22, 180, 22));
		submitBtn.setForeground(Color.WHITE);
		submitBtn.setFont(new Font("Verdana", Font.BOLD, 18));
		submitBtn.setBorder(BorderFactory.createLineBorder(new Color(22, 222, 22), 3));
		add(submitBtn);
	}

	public void actionPerformed(ActionEvent e) {
		if (this.maleRadio.isSelected()) {
			gender = "Male";
		}
		if (this.femaleRadio.isSelected()) {
			gender = "Female";
		}
		if (this.othersRadio.isSelected()) {
			gender = "Others";
		}

		System.out.println(gender);
	}

}
