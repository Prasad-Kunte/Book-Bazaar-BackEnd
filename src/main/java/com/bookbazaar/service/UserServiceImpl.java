package com.bookbazaar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.UserDao;
import com.bookbazaar.model.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public void addUser(User user) {
		userDao.save(user);
		
	}

	@Override
	public void modifyUser(User user) {
		userDao.save(user);
		
	}

	@Override
	public User getById(int id) {
		Optional<User> opt = userDao.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}