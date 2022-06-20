package com.example.hibernateExample.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1toMany {
	public static void main(String[] args) {
//		Student st = new Student("Karuna Sapkota", "bhaktapur", "karuna@gmail.com");
//		Book book1 = new Book("Dark Matter", "Steven Hawkin");
//		Book book2 = new Book("Stranher Things", "Adam Smith");
//		Book book3 = new Book("Harry Potter", "JK Rowling");
//		book1.setSt(st);
//		book2.setSt(st);
//		book3.setSt(st);
//		ArrayList<Book> books = new ArrayList<Book>();
//		books.add(book1);
//		books.add(book2);
//		books.add(book3);
//		st.setBook(books);
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Book.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
//		session.persist(book1);
//		session.persist(book2);
//		session.persist(book3);
//		session.persist(st);
		Student sts = session.get(Student.class, 2);
		System.out.println(sts);
		Book book = session.get(Book.class, 5);
		System.out.println(book);
		tx.commit();
		session.close();
	}
}
