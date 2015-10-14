package myJavaCodes;
//Getting user input: Using Scanner class

import java.util.Scanner;

public class UserInputApplication {

	public static void main(String[] args) {
		//Create Scanner object and pass it the std predefined inuot stream System.in
		Scanner input = new Scanner(System.in);                                         
		
		//Output the prompt
		System.out.println("Enter a line of text: ");
		
		//Wait for the user to enter a line 
		String line = input.nextLine();
		
		System.out.println("You entered: " + line);
		
		//Example 2 - Enter an integer 
		
		System.out.println("Enter an integer: ");
		
		int value  = input.nextInt();
		
		System.out.println("You entered: " + value);
		
	    //For floating values - double value = input.nextDouble();
	}

}
