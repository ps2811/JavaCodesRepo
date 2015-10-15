package myJavaCodes;
//Getters - to retrieve data or calculate some data

//Encapsulation - later - means data in a class is idden away from other classes
//So should stop main class from accessing person class variables
//Make age and name as private to hide away and define getAge and getName methods to access them
class PersonClass {
	//instance variables (data or state)
	String name;
	int age;
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	int calculateYearToRetirement() {
	//void calculateYearToRetirement() {
			
		int yearsLeft = 65 - age ;
		return yearsLeft;
		//System.out.println(yearsLeft);
	}
	
}

public class GettersApp {

	public static void main(String[] args) {
		PersonClass person1 = new PersonClass();
		person1.name = "Joe";
		person1.age  = 30;
		person1.speak();
		
		int years = person1.calculateYearToRetirement();
		System.out.println(years);
	}

}
