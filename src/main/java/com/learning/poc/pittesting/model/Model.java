package com.learning.poc.pittesting.model;

public class Model {
	
	private String name;
	private int value;
	
	
	public Model() {
		super();
	}
	
	public Model(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	

}
