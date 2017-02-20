package com.daysluck.service;

import java.util.List;

import com.daysluck.domain.User;

public interface UserService {

	User findByName(String name);
	
	int insert(String name, Integer age);
	
	int insertByUser(User user);
	
	List<User> findByAge(Integer age,Integer pageno);
}
