package com.bookbazaar.cntr;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
		Date date = new Date();
		user.getAddress().setUpdatedate(date.toString());
		userService.addUser(user);
		return "success";
	}
	
	@PostMapping(value = {"/updateUser"}) 
	public String userModify(@RequestBody User user) {
		Date date = new Date();
		user.getAddress().setUpdatedate(date.toString());
		userService.modifyUser(user);
		return "success";
	}
	
	@GetMapping(value = {"/user/{userId}"})
	public User userGet(@PathVariable int userId) {
		return userService.getById(userId);
	}
	@GetMapping(value = {"/Alluser"})
	public List<User> userGet() {
		return userService.getAll();
	}
	@GetMapping(value = {"/userEmail/{email}"})
	public User userGetByEmail(@PathVariable String email) {
		return userService.getByEmail(email);
	}
	@GetMapping(value = {"/userMob/{mobno}"})
	public User userGetByMobno(@PathVariable String mobno) {
		return userService.getByMobno(mobno);
	}
	@DeleteMapping(value = {"/DeleteUser/{id}"})
	public String productDelete1(@PathVariable int id) {
		userService.removeById(id);
		return "success";
	}
}
