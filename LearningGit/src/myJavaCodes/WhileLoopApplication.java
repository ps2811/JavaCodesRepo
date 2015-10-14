package myJavaCodes;
//While Loops functionality - introducing boolean data type also
public class WhileLoopApplication {
	public static void main(String[] args) {
		//Example 1: boolean type used to store TRUE or FALSE 
		boolean loop = true;
		//System.out.println(loop);
		
		//Example 2: Using an expression and storing it in boolean variable 
		loop = 4 < 5 ;
		//System.out.println(loop);
		
		//Example 3: Using a variable 
		int value = 7;
		loop = value > 10;

		System.out.println(loop);
		
		int i = 0;
		
		while(i < 10)
		{
			System.out.println("Value: " + i);
			i = i + 1;
		}
		
		
	}
}
