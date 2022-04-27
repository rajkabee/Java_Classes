package hibernateExample.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateTest {
	public static void main(String[] args) {
		Student st = new Student("Amrit", "Bista", "amrit@gmail.com");
		/*
		Configuration cfg = new Configuration()
							.configure()
							.addAnnotatedClass(Student.class);
		SessionFactory sf = new cfg.buildSessionFactory();
		*/
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
      
        SessionFactory sf = meta.getSessionFactoryBuilder().build();  
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(st);
		tx.commit();
		session.close();

		
		
	}
}
