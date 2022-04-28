package com.hbg.orm;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class App2 {
	public static void main( String[] args ){
		Configuration con = new Configuration()
    		   .configure()
    		   .addAnnotatedClass(Student.class)
    		   .addAnnotatedClass(Book.class);
		Session session = con.buildSessionFactory().openSession();
		Book book1 = new Book(123, "Muna Madan", "laxmi prasad Devkota");
		Book book2 = new Book(123, "Muna Madan", "laxmi prasad Devkota");
		Student st = new Student("beny", "dale", "benidale@gmail.com");
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(book2);
		books.add(book1);
		st.setBooks(books);
		session.save(st);
		session.save(book1);
		session.save(book2);
		session.beginTransaction().commit();
		session.close();
    }
}
