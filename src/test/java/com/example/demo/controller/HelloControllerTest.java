package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

class HelloControllerTest {

	
	
	@Test
	void test() {
		HelloController helloController = new HelloController();
		Model model = new BindingAwareModelMap();
		model.addAttribute("user", "Dolly");
		assertAll(
				() -> assertEquals(helloController.getHello("Dolly", model), "hello"),
				() -> assertEquals(model.getAttribute("user"), "Dolly")
				);
	}

}
