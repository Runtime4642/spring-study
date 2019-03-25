package com.example.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {

	

	@ResponseBody
	@RequestMapping("/list")
	public String list(@RequestParam("name") String name/*name 파람을 안주면 에러남*/) {
		return "BoardController:list";
	}

	@ResponseBody
	@RequestMapping("/write")
	public String write(@RequestParam(value="name",required=false)/*required=false로 해주면 안줘도 에러안남 기본=true*/ String name,
			@RequestParam(value="content",required=true,defaultValue="안넣음")/*추천 하는방식 defaultValue값을줌*/ String content,
			@RequestParam String password, //value= password
			@RequestParam ("e")String email) {

		System.out.println(name);
		System.out.println(content);
		return "BoardController:write";
	}


	@ResponseBody
	@RequestMapping("/delete")
	public String write(@RequestParam(value="no",required=false)/*required=false로 해주면 안줘도 에러안남*/ Long no) {
		System.out.println(no);
		return "BoardController:delete";
	}
	
	@ResponseBody
	@RequestMapping("/view")
	public String view(@RequestParam(value="no",required=true,defaultValue="123")/*Long 이더라도 String 으로 defalutValue 설정*/ Long no) {
		System.out.println(no);
		return "BoardController:view";
	}
	
	@ResponseBody
	//http://localhost:8089/hellospring/board/view2/10
	@RequestMapping("/view2/{id}/{no}")
	public String view2(@PathVariable("no") Long no,
			@PathVariable("id") String id) {
		System.out.println(no);
		System.out.println(id);
		return "BoardController:view2";
	}
	
	
}
