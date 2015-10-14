package myJavaCodes;
//Strings :Working with texts - Udemy 
public class Application {
	public static void main(String[] args) {
		int myInt = 7;
		
		String text = "Hello";
		System.out.println(text);
		//String has the strength of referring to something 
		
		String blank = " ";
		String name  = "Pooja";
		
		//Add the strings 
		String greeting = text + blank + name;         //One way to add the strings
		System.out.println("Hello" + " " + "Pooja");   //Second way to add strings
		
		//Add an integer 
		System.out.println("My integer is: " + myInt);
		
		double myDouble = 7.8;
		System.out.println("My number is: " + myDouble + ".");
	
	}
}
