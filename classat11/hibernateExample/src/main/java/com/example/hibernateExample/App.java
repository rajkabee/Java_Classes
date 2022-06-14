package com.example.hibernateExample;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        Student st = new Student("binod khadka ", "binod@gmail.com", "lalitpur");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //session.persist(st);
        //Student sts = session.find(Student.class, 1);
        //System.out.println(sts);
        //session.update(st);
        //session.delete(st);
        
        ArrayList<Student> students = (ArrayList<Student>) session.createQuery("SELECT a FROM Student a", Student.class).getResultList();
        System.out.println(students);
        tx.commit();
        session.close();
        
        
    }
}
