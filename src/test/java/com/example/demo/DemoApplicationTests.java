package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Greeting;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {
		assertNotNull(context);
		int count = context.getBeanDefinitionCount();
		System.out.println(count);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
	}
	
	@Test
	void testEqual() {
		Greeting greeting1 = context.getBean("defaultGreet", Greeting.class);
		Greeting greeting2 = context.getBean("defaultGreet", Greeting.class);
		
		greeting1.setMessage("Dolly");
		System.out.println(greeting2.getMessage());
		
		
//		assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean(Greeting.class));
		
		assertEquals(greeting1, greeting2);
	}

}
