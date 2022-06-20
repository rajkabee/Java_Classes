package com.example.swingApp;

import java.util.ArrayList;

import javax.swing.JFrame;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserTableFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Users Table");
		frame.setDefaultCloseOperation(3);
		String cols[] = { "First Name", "Last Name", "Email", "Gender", "Age", "Username", "Password" };

		Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
		Session session = con.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		ArrayList<User> userList = (ArrayList<User>) session.createQuery("SELECT a FROM User a").getResultList();
//		List<String> strings = userList.stream().map(object -> Objects.toString(object, null))
//				.collect(Collectors.toList());
		String[][] users = new String[userList.size()][7];
		int i = 0;

		for (User user : userList) {
			users[i] = user.toArray();
			i++;
		}

//		for (i = 0; i < userList.size(); i++) {
//			for (int j = 0; j < 7; j++) {
//				System.out.print(users[i][j] + "\t");
//			}
//			System.out.println();
//		}
		tx.commit();
		session.close();
		frame.pack();
		frame.setVisible(true);

	}
}
