package com.bookbazaar.service;

import com.bookbazaar.model.User;

public interface UserService {
	void addUser(User user);
	void modifyUser(User user);
	User getById(int userId);

}
