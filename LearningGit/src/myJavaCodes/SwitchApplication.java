package myJavaCodes;

import java.util.Scanner;
//Switch allows to take different actions based on different values 
//Not used much by professional developers
//Can switch only certain kinds of variables - int and String are common
//case - cannot have varaibles - only switch keyword can have variables

public class SwitchApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		
		String text  = input.nextLine();
		
		switch(text) {
		case "start":
			System.out.println("Machine started: ");
			break;
		
		case "stop":
			System.out.println("Machine stopped");
			break;
			
			default:
				System.out.println("Command not recognized ");
		
		}
		
	}

}
