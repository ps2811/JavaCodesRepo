package com.javalearnings;
//right click - Source - Generate constructors 

public class Person implements InfoInterface {
	
	public Person(String name) {
		//super();
		this.name = name;
	}

	private String name; 
		
	public void greet() {
		System.out.println("Hello World");
	}
	
	//implementing the interface method
	public void showInfo() {
		System.out.println("Person name is: " + name);
	}
	

}
