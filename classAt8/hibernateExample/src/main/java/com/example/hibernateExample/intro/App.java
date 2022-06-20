package com.example.hibernateExample.intro;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// Student st = new Student(3, "Samantha george", "australia",
		// "samantha@gmail.com");
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		// SessionFactory sf = con.buildSessionFactory();
		Session session = con.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		// session.persist(st);
		// session.update(st);
		Student sts = session.get(Student.class, 3);
		System.out.println(sts);
		session.delete(sts);
		tx.commit();
		session.close();

	}
}
