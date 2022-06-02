package com.example.JavaSwingExample.forms;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.example.JavaSwingExample.model.Product;
import com.example.JavaSwingExample.model.ProductDao;

public class JavaSwingForms {
	public static void main(String[] args) throws IOException {
		JFrame frame  = new JFrame();
		frame.setTitle("My Frame");
		final Product product = new Product();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 150, 600, 400);
		//frame.setSize(600, 400);
		//frame.pack();
		frame.setIconImage(ImageIO.read(new File("res/icon.png")));
		frame.setLayout(null);
		
		
		
		
		
		JPanel form = new JPanel();
		form.setLayout(null);
		form.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		form.setBounds(0, 0, 600, 400);
		form.setBackground(Color.DARK_GRAY);
		frame.add(form, new BorderLayout().NORTH);
		JLabel formHeader = new JLabel("New Product Form");
		formHeader.setForeground(Color.WHITE);
		formHeader.setFont(new Font("Verdana", Font.PLAIN, 24));
		formHeader.setBounds(200, 0, 300, 50);
		form.add(formHeader);
		
		JLabel nameLabel = new JLabel("Product Name: ");
		nameLabel.setBounds(100, 60, 200, 30);
		nameLabel.setForeground(Color.WHITE);
		form.add(nameLabel);
		
		final JTextField nameTextField = new JTextField();
		nameTextField.setBounds(300, 60, 200, 25);
		form.add(nameTextField);
		
		JLabel modelLabel = new JLabel("Model No.: ");
		modelLabel.setBounds(100, 100, 200, 30);
		modelLabel.setForeground(Color.WHITE);
		form.add(modelLabel);
		
		final JTextField modelTextField = new JTextField();
		modelTextField.setBounds(300, 100, 200, 25);
		form.add(modelTextField);
		
		JLabel manufacturerLabel = new JLabel("Manufacturer: ");
		manufacturerLabel.setBounds(100, 140, 200, 30);
		manufacturerLabel.setForeground(Color.WHITE);
		form.add(manufacturerLabel);
		
		final JTextField manufacturerTextField = new JTextField();
		manufacturerTextField.setBounds(300, 140, 200, 25);
		form.add(manufacturerTextField);
		
		JLabel descriptionLabel = new JLabel("Description: ");
		descriptionLabel.setBounds(100, 180, 200, 30);
		descriptionLabel.setForeground(Color.WHITE);
		form.add(descriptionLabel);
		
		final JTextArea descriptionTextField = new JTextArea();
		descriptionTextField.setBounds(300, 180, 200, 50);
		form.add(descriptionTextField);
		
		JLabel colorLabel = new JLabel("Color: ");
		colorLabel.setBounds(100, 240, 200, 30);
		colorLabel.setForeground(Color.WHITE);
		form.add(colorLabel);
		
		final JButton colorChooserBtn = new JButton("Choose Color");
		colorChooserBtn.setBounds(300, 240, 200, 30);
		form.add(colorChooserBtn);
		
		JButton submitBtn= new JButton("Submit");
		submitBtn.setBounds(100, 280, 400, 40);
		form.add(submitBtn);
		
		colorChooserBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Color backgroundColor = JColorChooser.showDialog(new JFrame(),
		                "Choose background color", Color.white);
				colorChooserBtn.setBackground(backgroundColor);
				product.setColor(backgroundColor);
				
			}
		});
		submitBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				product.setProductName(nameTextField.getText());
				//product.setModel(modelTextField.getText());
				product.setDescription(descriptionTextField.getText());
				product.setBrand(manufacturerTextField.getText());
				ProductDao pDao = new ProductDao();
				pDao.save(product);
				
			}
		});
		
		frame.setVisible(true);
	}
}
