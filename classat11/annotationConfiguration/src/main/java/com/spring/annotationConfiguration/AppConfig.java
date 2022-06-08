package com.spring.annotationConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.annotationConfiguration")
public class AppConfig {
	@Bean(name="st")
	public Student getStudent() {
		return new Student(321, "pradip", "pradhan", "pradip@gmail.com");
	}
	
	@Bean(name="lp")
	public Laptop getLaptop() {
		return new Laptop(453, "lenovo", "500");
	}
	
}
