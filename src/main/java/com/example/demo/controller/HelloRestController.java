package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;

@RestController
public class HelloRestController {
	
	@GetMapping("/rest")
	public Greeting greet(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return new Greeting("Hello "+name);
		
	}

}
