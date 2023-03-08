package com.bookbazaar.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookbazaar.model.Book;
import com.bookbazaar.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	@PostMapping(value = {"/books"}) 
	public String userAdd(@RequestBody Book book) {
		bookService.addBook(book);
		return "success";
	}
	@PostMapping(value = {"/bookUser"}) 
	public String bookModify(@RequestBody Book book) {
		bookService.modify(book);
		return "success";
	}
	
	@GetMapping(value = {"/Books/{bookId}"})
	public Book userGet(@PathVariable int bookId) {
		return bookService.getById(bookId);
	}

}
