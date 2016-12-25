package com.chetank.service;

import com.chetank.model.User;

import java.util.List;



public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
	
}