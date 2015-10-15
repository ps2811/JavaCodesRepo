package myJavaCodes;
//Can have only one public class in a file and rest of the classes are non public
//A class is a blue print of creating objects
//Objects - real world everything is an object - example Person class can be used to create diff ob

//Classes can contain 
// 1.Data - location ,heartbeat,color etc in hte form of instance variables
// 2.Subroutines(methds) example - main method

class Person {
	//instance variables (data or state)
	String name;
	int age;
	void speak() {
		System.out.println("My name is: " + name + " and I am" + age + " years old");
	}
	
}
public class ClassesnObjects {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Pranjal";      //not a best practice
		person1.age  = 28;
		
		Person person2 = new Person();
		person2.name   = "Pooja";
		person2.age    = 28;
		
		System.out.println(person1.name);
		person1.speak();
		person2.speak();
	}

}
