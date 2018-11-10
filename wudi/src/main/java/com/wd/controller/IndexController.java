package com.wd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wd.dao.User;
import com.wd.service.UserService;

@RestController
public class IndexController {
	
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/index")
	public String index() {
		return "准备开始我的新的开始";
	}
	
	@RequestMapping("/get")
	public User getUser(int id) {
		return userService.findById(id);
		
		
		
	}
	
	
	
}
