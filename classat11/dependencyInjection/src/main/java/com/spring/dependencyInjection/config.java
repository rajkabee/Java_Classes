package com.spring.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.spring.dependencyInjection")
@PropertySource("classpath:application.properties")
public class config {
	
	@Bean("student")
	public Student getStudent() {
		return new Student();
	}
	@Bean("book2")
	public Book getBook() {
		return new Book(123, "Black Moon");
	}
	
	@Bean("bk")
	@Scope("prototype")
	public Book newBook() {
		return new Book(456, "Muna Madan");
	}
}
