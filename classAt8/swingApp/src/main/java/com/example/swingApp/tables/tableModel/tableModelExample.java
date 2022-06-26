package com.example.swingApp.tables.tableModel;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.swingApp.User;

public class tableModelExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Default Table Model Example");
		frame.setDefaultCloseOperation(3);
		Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
		Session session = con.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		ArrayList<User> userList = (ArrayList<User>) session.createQuery("SELECT a FROM User a").getResultList();
		tx.commit();
		session.close();
		UserTableModel model = new UserTableModel(userList);
		JTable table = new JTable(model);
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane);

		frame.pack();
		frame.setVisible(true);
	}
}
