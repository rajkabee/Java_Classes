package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repos.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	
	@RequestMapping("/users")
	public String users() {
		return "user/users";
	}
	@RequestMapping("/addUserForm")
	public String addUserForm() {
		return "user/addUserForm";
	}
	@ResponseBody
	@RequestMapping("/addUser")
	public String addUserForm(@RequestParam("fName") String fName,
								@RequestParam("lName") String lName,
								@RequestParam("email") String email,
								@RequestParam("address")String address) {
		User user = new User(fName, lName,  address, email);
		userRepo.save(user);
		return user.toString();
	}
	
}
