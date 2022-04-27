package com.hbg.hibernateExample5;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Student st = new Student(1, "Bandhu", "Bista", "amrit@gmail.com");
       Configuration con = new Configuration()
    		   .configure()
    		   .addAnnotatedClass(Student.class);
       Session session = con.buildSessionFactory().openSession();
       //session.save(st);
       //Student s = session.load(Student.class, 1);
       //Student s = session.get(Student.class, 1);
       //session.saveOrUpdate(st);
       //System.out.println(s);
       ArrayList<Student> stList = new ArrayList<Student>();
       stList = (ArrayList<Student>) session.createQuery("select");
       System.out.println(stList);
       session.beginTransaction().commit();
       session.close();
    }
}
