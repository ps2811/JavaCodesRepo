package myJavaCodes;

//Strings 
//In java String are IMMUTABLE - can never change but info below chnages it in below example
//So basically the first string "" does not chnage instead next time new string gets created 
//and refernce of info variable is changed everytime
//To counter this inefficieny - StringBuilder class returns reference to the same string

//StringBuffer - a thread safe fashion of StringBuilder

public class StringBuilderApp {

	public static void main(String[] args) {
		String info = "";
		info += "My name is Emma.";
		info += " ";
		info += "I am beautiful";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");  //gets initialzed to ""
		sb.append("My name is Rob Stark. ");        //append does not create a new string 
		sb.append("I am the Lord of Winterfell");
		//to get the text 
		System.out.println(sb.toString());
		
		//Another way 
		StringBuilder s = new StringBuilder();
		s.append("My name is Aria. ") 
		.append(" I am a warrior.");
		System.out.println(s);
		
		/////////String Formatting //////////
		System.out.print("More text");     //the next print will start from the same line
		System.out.println("Here is some text.\tThat was a tab.\nThat was a line");
		
		/////////Formating integers /////////////
		//Can embed special formatting characters d - for integers 
		//10d% gvies 10 spacing assuming length could be 10 towardss left
		//-10d gives 10 spacing towards right
		System.out.printf("Total cost %-5d and %10d\n", 5,7);
		
		//%s - fr String ; %f - for floating point
		
		/////////Formating numbers left or right and string %s
		for(int i = 0;i<20;i++) {
			System.out.printf("%-2d: %s\n",i,"F.R.I.E.N.D.S.");
		}
		////////Formating floating point //////////
		System.out.printf("Total value: %f\n",5.6);
		System.out.printf("Total value: %.2f\n",5.629);
	}

}
