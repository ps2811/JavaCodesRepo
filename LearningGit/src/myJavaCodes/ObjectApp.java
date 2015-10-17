package myJavaCodes;
//toString() - method from Object class - available to all classes
//Object class is the parent class of all the classes in java
//if you print object in sop - it prints the hashcode for that object - sort of unique identifier
//Note :if toString method defined then does not retrun hashcode - returns the string
//String.format - to format string same as printf

class Frog {
	private String name;
	private int id;
	
	public Frog(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
//	public String toString() {
//		return "Hello";
//	}
	
//	Way2 
/*	public String toString() {
		return String.format("%4d: %s",id,name);
		*/
	
//Way 3
 public String toString() {
	 StringBuilder sb = new StringBuilder();
	 sb.append(id).append(" - ").append(name);
	 
	 return sb.toString();
 }
 
 	}

public class ObjectApp {

	public static void main(String[] args) {
		Object obj = new Object();
		Frog frog1 = new Frog(5,"Felangi");
		System.out.println(frog1);
		
	}

}
