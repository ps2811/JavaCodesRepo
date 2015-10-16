package myJavaCodes;

//Static keyword /final 
//static variables belong to the class and not to the object and are called "class variables"
//so rest of the variables are called instance variables (instance variables - initialized by default

//Static methods - runby classname.methodname - 
//Static methods can access static variables 
//BUT static methods cannot output instance variables or non static variables
//Instance methods CAN access static variables
//USAGE: 1. if not dealing with any instance variables 
//USAGE: 2. Math.class  has constants attached to it like pie (Math.PI)
//USAGE: 3.Counting the number of objects being created for a class
//USAGE: 4.Assigning a new object id to every object of a class
//final - the variable cannot be reassigned ;the value is final

class Thing {
	public String name;
	public static String description;
	public final static int LUCKY_NUMBER = 7;             //USAGE 2
	public int id;                                        //USAGE 4
	public static int count = 0;                          //USAGE 3 - normally wd be private
	
	public Thing() {
		count++;
		id = count;
	}
	
	public void showName() {
		System.out.println("Object ID: " + id + description + name);
	}
	public static void showInfo() {
		System.out.println(description);
	}
	
}

public class StaticApp {

	public static void main(String[] args) {
		
		System.out.println("Count of objects before " + Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name    = "Instance variable: Ben";
		thing2.name    = "Instance variable: Emma";
		
		Thing.description = " Static var: I am a thing ";               //accessing the static variable
		Thing.showInfo();                                 //accessing the static method
		thing1.showName();
		thing2.showName();
		
		System.out.println("Static variable: " + Thing.LUCKY_NUMBER);
		System.out.println(Math.PI);
		System.out.println("Count of objects after " + Thing.count);
	}

}
