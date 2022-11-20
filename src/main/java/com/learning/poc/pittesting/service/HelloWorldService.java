package com.learning.poc.pittesting.service;

import com.learning.poc.pittesting.model.Model;

public class HelloWorldService {
	
	public Model helloWorld(String name, int value) {
		Model model= new Model(name, value);
		return model;
	}

}
