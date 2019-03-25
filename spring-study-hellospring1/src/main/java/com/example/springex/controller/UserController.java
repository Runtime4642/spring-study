package com.example.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springex.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {
	

	/*
	@RequestMapping(value="/joinform", method=RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/joinform.jsp";
	}*/
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/joinform.jsp";
	}
	
	@ResponseBody
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println(userVo);
		
		return "UserController:join()";
	}
	
	@ResponseBody
	@RequestMapping("/loginform")
	public String loginform() {
		return "UserController:loginform()";
	}

}
