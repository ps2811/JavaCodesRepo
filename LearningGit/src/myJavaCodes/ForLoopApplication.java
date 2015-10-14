package myJavaCodes;
//Shortcuts :CTRL + SHIFT + F          >>> to format the entire code 
//Type sysout followed by CTRL + SHIFT >>> gives System.out.println

public class ForLoopApplication {
	public static void main(String[] args) {
		
		//Example 1: An infinite loop example 
		//for(;;) {
		//	System.out.println("Hello");
		//}
		
		//Example 2: Finite loop with defined conditions
		for(int i =0;i<5;i++) {
			System.out.println("Hello :)" );
		}
		
		//Example 3 : Using printf instead of System.out.println
		//format specifier - it contains a string and "%" sign followed by a letter 
		//For an integr the letter is d -printf - replaces %d with value specified after comma
		//first argument is a string and second arg is a value 
		
		//printf does not have an invisible line by default after each line unlike sop
		for(int i=0;i<5;i++) {
			System.out.printf("The value of i is %d\n",i);
			
		}
	}

}
