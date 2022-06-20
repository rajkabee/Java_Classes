package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;

@SpringBootApplication
public class SpringBootWithThymeleafLombokJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithThymeleafLombokJpaApplication.class, args);
		User user1 = new User();
		user1.setFName("hari");
		User user2 = new User(1, "Kalyan", "Khatri", "kalyan@gmail.com", "pasword@123");
		System.out.println(user1);;
		System.out.println(user2);
	}

}
