package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Pramila");
		return "index.html";
	}
}
