package com.example.hibernateExample;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
	public static void main(String[] args) {
		Configuration con = new Configuration()
							.configure()
							.addAnnotatedClass(Book.class)
							.addAnnotatedClass(Student.class);
	    //Student st = new Student("narayan pradhan", "narayan@gmail.com", "bhaktapur");
	    //Book book = new Book("Path og glory", "Jarhead");
	    //st.setBook(book);
		SessionFactory sf = con.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction tx = session.beginTransaction();
	    //session.persist(book);
	    //session.persist(st);
	    Student sts = session.get(Student.class, 4);
	    System.out.println(sts);
	    tx.commit();
	    session.close();
	}
    
    
}

