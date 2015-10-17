package myJavaCodes;
//Inherits from Machines Class 
//Method overidding - start method 
//Right click - Source - implementing and overriding methods

public class Car extends Machines {
	public void wipeWindShield() {
		System.out.println("Wiping wind shield...");
	}
	@Override
	public void start() {
		System.out.println("Car Started...");
	}
	

}
