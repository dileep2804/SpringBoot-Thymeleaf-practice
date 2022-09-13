package com.dileep.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	//add mapping for "/hello"
	@GetMapping("/hello")
	public String helloworld(Model theModel) {
		theModel.addAttribute("theDate",new java.util.Date());
		return "helloworld"; 
		//with thymeleaf dependency it will look for this 
		// src/main/resources/templates/helloworld.html file
	}
}
