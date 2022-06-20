package com.example.hibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// Product p = new Product("mouse", "rgb backlit gaming mouse", 2200);
		Configuration con = new Configuration().configure().addAnnotatedClass(Product.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		// session.persist(p);
		Product pd = session.find(Product.class, 1);
		// pd.setPrice(3000);
		// session.update(pd);
		// session.delete(pd);
		tx.commit();
		System.out.println(pd);
		session.close();
	}
}
