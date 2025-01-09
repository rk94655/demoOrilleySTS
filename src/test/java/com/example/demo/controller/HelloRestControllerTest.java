package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Greeting;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloRestControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	void testWithoutName() {
		Greeting greeting = (Greeting) testRestTemplate.getForObject("/rest", Greeting.class);
		assertEquals("Hello World",greeting.getMessage());
	}
	
	@Test
	void testWithName() {
		ResponseEntity<Greeting> responseEntity =  testRestTemplate.getForEntity("/rest?name=Dolly", Greeting.class);
		assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
		assertEquals(MediaType.APPLICATION_JSON,responseEntity.getHeaders().getContentType());
		assertEquals("Hello Dolly",responseEntity.getBody().getMessage());
	}

}
