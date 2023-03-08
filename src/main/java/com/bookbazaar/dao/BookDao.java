package com.bookbazaar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.bookbazaar.model.Book;

@Repository
public interface BookDao extends CrudRepository<Book , Integer> {

//	public List<Book> findByTitle(@Param(value = "title") String title);
//	public List<Book> findByCatagory(@Param(value = "catagory") String catagory);
//	public List<Book> findByGenre(@Param(value = "genre") String genre);
//	public List<Book> findByLanguage(@Param(value = "language") String language);
//	public List<Book> findByDescContaining(@Param(value = "input")String input);
	
	
	
}