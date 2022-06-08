package com.spring.annotationConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Laptop lp = context.getBean(Laptop.class, "Laptop");
        System.out.println(lp);
        Student st = (Student)context.getBean("student");
        
        System.out.println(st);
        Student sts = (Student)context.getBean("st");
        System.out.println(sts);
    }
}
