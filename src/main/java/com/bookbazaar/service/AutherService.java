package com.bookbazaar.service;

import java.util.List;

import com.bookbazaar.model.Auther;

public interface AutherService {
	void addAuther(Auther auther);
	void modify(Auther auther);
	void removeById(int id);
	Auther getById(int id);
	List<Auther> getAll();
	
}
