package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController{
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/user")
	public String user() {
		return "user";
	}
	@RequestMapping("/manager")
	public String manager() {
		return "manager";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
}
