package com.learning.poc.pittesting.service;

import org.junit.jupiter.api.Test;

import com.learning.poc.pittesting.model.Model;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldServiceTest {
	
	HelloWorldService service= new HelloWorldService();

	@Test
	void when_name_and_value_given_then_generate_model() {
		service.helloWorld("Hello", 10);
	}

	//
//	@Test
//	void when_name_and_value_given_then_return_model_improved() {
//		Model model= service.helloWorld("Hello", 10);
//		assertNotNull(model);
//		assertEquals("Hello", model.getName());
//		assertEquals(10, model.getValue());
//	}
}
