package com.chetank.dao;

import com.chetank.model.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserDao {

	User findById(Integer id);

	List<User> findAll();

	void save(User user);

	void update(User user);

	void delete(Integer id);

}