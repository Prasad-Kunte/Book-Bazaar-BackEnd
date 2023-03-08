package com.bookbazaar.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookbazaar.service.UserService;
import com.bookbazaar.model.User;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping(value = {"/userss"}) 
	public String userAdd(@RequestBody User user) {
		userService.addUser(user);
		return "success";
	}
	@PostMapping(value = {"/updateUser"}) 
	public String userModify(@RequestBody User user) {
		userService.modifyUser(user);
		return "success";
	}
	
	@GetMapping(value = {"/profile/{userId}"})
	public User userGet(@PathVariable int userId) {
		return userService.getById(userId);
	}
}
