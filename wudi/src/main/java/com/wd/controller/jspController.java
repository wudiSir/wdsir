package com.wd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jspController {
	
	
	@RequestMapping("/getindex")
	public String getIndex() {
		return "index";
	}
}
