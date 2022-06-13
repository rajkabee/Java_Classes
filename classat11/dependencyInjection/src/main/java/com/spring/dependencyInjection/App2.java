package com.spring.dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		Student st = (Student)ctx.getBean("st"); 
		System.out.println(st);
		
		Student sts = (Student)ctx.getBean("student");
		System.out.println(sts);
		//sts.getBook().setName("Romeo and Juliet");
		st.setName("Arnold");
		System.out.println(st);
		System.out.println(sts);
	}
}
