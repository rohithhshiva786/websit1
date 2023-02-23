package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppController {
	@RequestMapping("/")

    public String handleMethod1() {
		return "welcome";
		// TODO Auto-generated method stub

	}
}