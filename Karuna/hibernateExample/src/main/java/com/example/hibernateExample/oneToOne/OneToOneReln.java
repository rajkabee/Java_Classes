package com.example.hibernateExample.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneReln {
	public static void main(String[] args) {
		// Category cate = new Category();
		// Category cat = new Category(1, "Fashion", "All Fashion related products");
		// Product p = new Product("Jeans", "Levis jeans for women", 2200);
		// p.setCategory(cat);
		Configuration con = new Configuration().configure().addAnnotatedClass(Product.class)
				.addAnnotatedClass(Category.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		// session.save(cat);
		// session.save(p);
		Product pd = session.load(Product.class, 2);
		System.out.println(pd);
		tx.commit();
		session.close();
	}
}
