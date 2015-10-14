package myJavaCodes;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		//Keep asking the user to enter numbers until the user enters a specific number
		
		Scanner  scanner = new Scanner(System.in);
	/*	System.out.println("Enter a number");                     //line 1
		int value        = scanner.nextInt();                     //line 2
		
		while(value != 7) {
			System.out.println("No luck! Enter a number again");  //line 1
			value        = scanner.nextInt();                     //line 2
		}
		
		System.out.println("GOT IT !!!");
	}
	*/
	//Example 2: Using while loop line 1 and line 2 above are repeated so use DoWhile Loop
		//value needs to be defined out of do loop so that it can be used by while statement also
		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		while(value != 7);
		
		System.out.println("GOT IT !!!");
	}
}
