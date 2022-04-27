package com.hbg.hibernateExample6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	Student st = new Student("RamPrasad", "Ghimire", "ramprasad@gmail.com");
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    			.configure()
    			.build();
    	SessionFactory sf = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    	Session session = sf.openSession();
    	session.beginTransaction();
    	session.persist(st);
    	session.getTransaction().commit();
    	session.close();
    }

}
