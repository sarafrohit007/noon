package com.example.noon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class NoonController {

	@RequestMapping("/result")
	@ResponseBody
	public String printResult() {
		System.out.println("Inside get result function.... analysis");
		return "Inside get result function.... analysis";
	}
	
	@RequestMapping("/addbook")
	@ResponseBody
	public String addBook() {
		System.out.println("Inside Add Book function of ");
		return "Inside get result function.... analysis";
	}
	
	
	
	
}
