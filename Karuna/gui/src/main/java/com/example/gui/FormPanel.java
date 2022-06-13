package com.example.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.example.gui.model.Product;
import com.example.gui.model.ProductDao;

public class FormPanel extends JPanel implements ActionListener {
	JTextField productNameField, manufacturerField, descriptionField, priceField;
	JRadioButton availableButton, notAvailableButton;
	JButton submitButton;
	ButtonGroup bg;

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

		productNameField = new JTextField();
		productNameField.setBounds(250, 40, 200, 25);
		add(productNameField);

		JLabel manufacturerLabel = new JLabel("Manufacturer: ");
		manufacturerLabel.setBounds(100, 70, 150, 30);
		add(manufacturerLabel);

		manufacturerField = new JTextField();
		manufacturerField.setBounds(250, 70, 200, 25);
		add(manufacturerField);

		JLabel descriptionLabel = new JLabel("Product Description: ");
		descriptionLabel.setBounds(100, 100, 150, 30);
		add(descriptionLabel);

		descriptionField = new JTextField();
		descriptionField.setBounds(250, 100, 200, 25);
		add(descriptionField);

		JLabel priceLabel = new JLabel("Price: ");
		priceLabel.setBounds(100, 130, 150, 30);
		add(priceLabel);

		priceField = new JTextField();
		priceField.setBounds(250, 130, 200, 25);
		add(priceField);

		JLabel isAvailabelLabel = new JLabel("Is Availabel: ");
		isAvailabelLabel.setBounds(100, 160, 150, 30);
		add(isAvailabelLabel);

		availableButton = new JRadioButton("Available");
		availableButton.setBackground(Color.GRAY);
		availableButton.setBounds(250, 160, 80, 20);

		notAvailableButton = new JRadioButton("Not Available");
		notAvailableButton.setBounds(330, 160, 130, 20);
		notAvailableButton.setBackground(Color.GRAY);
		bg = new ButtonGroup();
		bg.add(availableButton);
		bg.add(notAvailableButton);
		add(availableButton);
		add(notAvailableButton);

		submitButton = new JButton("Submit");
		submitButton.setBackground(Color.GREEN);
		submitButton.setFont(new Font("Verdana", Font.BOLD, 18));
		submitButton.setForeground(Color.WHITE);
		submitButton.setBounds(100, 190, 350, 40);
		submitButton.addActionListener(this);
		add(submitButton);

	}

	public void actionPerformed(ActionEvent e) {
		Product product = new Product(productNameField.getText(), manufacturerField.getText(),
				descriptionField.getText(), Float.parseFloat(priceField.getText()),
				availableButton.isSelected() ? true : false);
		ProductDao pDao = new ProductDao();
		try {
			int i = pDao.save(product);
			if (i == 1) {
				JOptionPane.showMessageDialog(this, "Product added to the database!");
			} else {
				JOptionPane.showMessageDialog(this, "Product could not be added to the database!");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
