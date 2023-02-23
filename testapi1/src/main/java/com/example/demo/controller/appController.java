package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class appController {
	@GetMapping("/")

    public String handleMethod1(@RequestParam String name) {
		
		return "welcome"+name;
		// TODO Auto-generated method stub

	}
}
//	@RequestMapping("/login")
//	public String handleMethod2() {
//		return "hello everyone";
//	}


