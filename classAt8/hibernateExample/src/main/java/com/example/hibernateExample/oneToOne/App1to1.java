package com.example.hibernateExample.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1to1 {
	public static void main(String[] args) {
		Student st = new Student("Karuna Sapkota", "bhaktapur", "karuna@gmail.com");
		Book book = new Book("Dark Matter", "Steven Hawkin");
		st.setBook(book);
		book.setSt(st);
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Book.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(book);
		session.persist(st);

		tx.commit();
		session.close();
	}
}
