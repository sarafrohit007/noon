package com.example.noon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.noon.dto.Book;
import com.example.noon.services.INoonService;

@Controller
@RequestMapping("/api")
public class NoonController {
	
	@Autowired
	private INoonService noonService;

	@RequestMapping("/result")
	@ResponseBody
	public String printResult() {
		System.out.println("Inside get result function.... analysis");
		return "Inside get result function.... analysis";
	}
	
	@RequestMapping("/addbook")
	@ResponseBody
	public String addBook(@RequestBody Book book) {
		System.out.println("Inside Add Book function of ");
		noonService.addBook(book);
		return "Inside get result function.... analysis";
	}
	
	
	
	
}
