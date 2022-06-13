package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student st = new Student("RamPrasad", "Ghimire", "ramprasad@gmail.com");
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    			.configure("hibernate.cfg.xml")
    			.build();
    	Metadata meta = new MetadataSources( registry ).getMetadataBuilder().build();
    	SessionFactory sf = meta.getSessionFactoryBuilder().build();
    	Session session = sf.openSession();
    	session.beginTransaction();
    	session.persist(st);
    	session.getTransaction().commit();
    	session.close();
    	
		/*
		 * Configuration con = new
		 * Configuration().configure().addAnnotatedClass(Student.class); Student st =
		 * new Student("hari", "dahal", "hari@gmail.com"); SessionFactory sf =
		 * con.buildSessionFactory(); Session session = sf.openSession(); Transaction tx
		 * = session.beginTransaction(); session.persist(st); tx.commit();
		 * session.close();
		 */
    }
}
