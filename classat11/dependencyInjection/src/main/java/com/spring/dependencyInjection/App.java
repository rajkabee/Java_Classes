package com.spring.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Context created");
        Student st = (Student)context.getBean("student");
        System.out.println(st);
        
        
        Student sts = (Student)context.getBean("st");
        Book bk = (Book)context.getBean("bk");
        System.out.println(st);
        System.out.println(bk);
    }
}
