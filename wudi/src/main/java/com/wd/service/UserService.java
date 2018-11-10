package com.wd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wd.dao.User;
import com.wd.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Transactional
	public User findById(int id) {
		return userMapper.findById(id);
	}
	
	
	
}
