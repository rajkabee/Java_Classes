package com.spring.IocContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Application context created!");
        Student st =(Student)context.getBean("st");
        st.setfName("SAnjog");
        st.setlName("Baidhya");
        System.out.println(st);
        
    }
}
