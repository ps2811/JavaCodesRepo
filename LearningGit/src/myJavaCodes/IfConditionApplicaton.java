package myJavaCodes;

public class IfConditionApplicaton {
	public static void main(String[] args) {
		boolean cond = 1 < 6;
		int myInt    = 21;
		System.out.println(cond);
		
		if(cond) {
			System.out.println("Yes - its true...");
		
		}
		else if(myInt > 20) {
			System.out.println("Not,its false...");
		}
		else {
			System.out.println("None of the above");
		}
		
		//Example2 : Using while loop 
		int loop = 0;
		while(true) {
			System.out.println("Looping: " + loop);
			if(loop==5) {
				break; //break out of the loop;
			}
			
			loop++;
			System.out.println("Running");
		}
	}

}
