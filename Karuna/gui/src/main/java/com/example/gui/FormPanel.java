package com.example.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPanel extends JPanel {
	public FormPanel() {

		setFont(new Font("Vladimir script", Font.PLAIN, 30));

		setBackground(Color.GRAY);
		JLabel header = new JLabel("Product Form");
		header.setBounds(230, 0, 200, 40);
		setLayout(null);
		header.setFont(new Font("Vladimir script", Font.PLAIN, 30));
		header.setForeground(Color.WHITE);
		add(header);

		JLabel productNameLabel = new JLabel("Product Name: ");
		productNameLabel.setBounds(100, 40, 150, 30);
		add(productNameLabel);

		JTextField productNameField = new JTextField();
		productNameField.setBounds(250, 40, 200, 25);
		add(productNameField);

		JLabel manufacturerLabel = new JLabel("Manufacturer: ");
		manufacturerLabel.setBounds(100, 70, 150, 30);
		add(manufacturerLabel);

		JTextField manufacturerField = new JTextField();
		manufacturerField.setBounds(250, 70, 200, 25);
		add(manufacturerField);

		JLabel descriptionLabel = new JLabel("Product Description: ");
		descriptionLabel.setBounds(100, 100, 150, 30);
		add(descriptionLabel);

		JTextField descriptionField = new JTextField();
		descriptionField.setBounds(250, 100, 200, 25);
		add(descriptionField);
	}
}
