package myJavaCodes;

//Constructors
//Constructors uniquely have no return types;
//Constructors start with a capital letter
//Use for initialization of instance variables 
//Can have mulitple constructors 
//Calling second constructor from the first constructor - use this else compiler error
//constructor call should be the 1st line else error

class Machine {
  private String name;	
  
  public Machine() {
	  this("Emma");     //this calls the second constructor 
	  name = "Emma";
	//  this("Emma");  compiler error - constructor call should be the 1st line in the code

	  System.out.println("First Consturctor Running... with name: " + name);
	//  Machine("Emma");    //compiler error  - need to replace with "this" keyword
  }
  
  public Machine(String name) {
      this.name  = name;
	  System.out.println("Second constructor runnng... with name: " + this.name);
  }
}

public class ConstructorApp {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		new Machine("Bertie") ;    //also creates an object and invokes the constructor
		
	}

}
