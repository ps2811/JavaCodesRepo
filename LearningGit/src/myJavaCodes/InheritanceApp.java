package myJavaCodes;
//Inheritance - so far creating classes in the same file but will be creating files in different 
//files. 
//Uses a Machine class.
//String Class - is a final class - so cannot be extended
//Method Overriding 
//super.start() - calls the methd from the parent class 
//private variables cannot be inherited - only accessible within the class its defined
//if not private - defaul tis package and can be accessed anywhere within the package
//protected - can access in package or child class 

public class InheritanceApp {

	public static void main(String[] args) {
		
		Machines mach1 = new Machines();
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.stop();
		car1.wipeWindShield();
	}

}
