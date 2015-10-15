package myJavaCodes;
//Implementing Encapsulation - hiding instances variables from other classes by making them private

class Fairy {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
public class Setters_this {

	public static void main(String[] args) {
		Fairy obj = new Fairy();
		obj.setName("Emma");
		System.out.println(obj.getName());
	}

}
