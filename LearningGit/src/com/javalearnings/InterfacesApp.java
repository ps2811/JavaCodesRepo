package com.javalearnings;
///////Interfaces//////////

//Machine and Person cannot have the same parent class - bt can have showInfo as common so create 
//interface InfoInterface
//Method bodies are not defined in the interfaces 
//if implementing any interface then its methods hould also be implmented in that class else error
//can have multiple interfaces separated by commas 


public class InterfacesApp {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Ross"); 
		person1.greet();
        
		//refering interface type variable to an object that implements that interface
		InfoInterface info1 = new Machine();
		info1.showInfo();
		
		InfoInterface info2 = person1;
		info2.showInfo();
		
		outputInfo(mach1);
		outputInfo(person1);
		
		
	}
	
	//takes parameter of interface type 
	public static void outputInfo(InfoInterface info) {
		info.showInfo();
	}

}
