package myJavaCodes;

public class StringArrayApp {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Aging";
		words[1] = "Beautifully";
		words[2] = "-Forbes";
		
		System.out.println(words[2]);
		
		//Another way 
		String[] fruits = {"apple","banana","pear","kiwi"};
		
		//New way of iterating arrays
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		//Values and references
		int value = 123;   //int is a primitive type - starts with lower case letter
		
		String text = null;       //not allocating memory - allocating enough memory for
		System.out.println(text); //storing the reference for the string 
		                          //default value for reference is null
		String[] texts = new String[2];
		
	}

}
