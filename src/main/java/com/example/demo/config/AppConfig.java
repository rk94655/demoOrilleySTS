package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Greeting;

@Configuration
public class AppConfig {

	public AppConfig() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	public Greeting defaultGreet() {
		return new Greeting("Hello World");
	}
	
	@Bean
	public Greeting whatup() {
		return new Greeting("What up ?");
	}

}
