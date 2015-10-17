package com.javalearnings;

public class Machine implements InfoInterface {
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine started");
	}
	
	public void showInfo() {
		System.out.println("Machine id: " + id);
	}

}
