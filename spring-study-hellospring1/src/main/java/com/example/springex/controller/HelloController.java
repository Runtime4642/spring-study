package com.example.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	
	@RequestMapping("*.do")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	
}
