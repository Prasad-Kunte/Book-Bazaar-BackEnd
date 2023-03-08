package com.bookbazaar.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookbazaar.model.Auther;
import com.bookbazaar.service.AutherService;

@RestController
public class AutherController {
	@Autowired
	private AutherService autherService;
	
	@PostMapping(value = {"/addauther"}) 
	public String autherAdd(@RequestBody Auther auther) {
		autherService.addAuther(auther);
		return "success";
	}
	@PutMapping(value = {"/updateauther"})
	public String autherUpdate(@RequestBody Auther auther) {
		autherService.modify(auther);
		return "success";
	}
	@DeleteMapping(value = {"/deleteauther/{id}"})
	public String autherDelete(@PathVariable int id) {
		System.out.println("first delete");
		autherService.removeById(id);
		return "success";
	}
	@GetMapping(value = {"/getauther/{id}"})
	public Auther autherGet(@PathVariable int id) {
		return autherService.getById(id);
	}
	@GetMapping(value = {"/getallauther"})
	public List<Auther> productList(){
		return autherService.getAll();
	}
}
