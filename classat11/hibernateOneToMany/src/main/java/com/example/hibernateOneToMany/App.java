package com.example.hibernateOneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student st = new Student("Gambhir Neupane", "gambhir@gmail.com", "koteshowr, ktm");
    	Book b1 = new Book("Patriots", "james frier");
    	Book b2 = new Book("notebook", "adam white");
    	Book b3 = new Book("Harry Potter", "JK Rowling");
    	b1.setSt(st);
    	b2.setSt(st);
    	b3.setSt(st);
    	ArrayList<Book> books = new ArrayList<Book>();
    	books.add(b1); books.add(b2); books.add(b3);
    	st.setBooks(books);
    	
    	Configuration con = new Configuration()
    						.configure()
    						.addAnnotatedClass(Student.class)
    						.addAnnotatedClass(Book.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
		/*
		 * session.persist(st); session.persist(b1); session.persist(b2);
		 * session.persist(b3);
		 */    	
    	Student sts = session.get(Student.class, 1);
    	tx.commit();
    	System.out.println(sts);
    	session.close();
 
    	
    	
    }
}
