package myJavaCodes;

public class MultiDimArrayApp {

	public static void main(String[] args) {
		//Multi dim array is an array of arrays - each can be of different array length
		
		//One dim array 
		int[] values = {3,5,2343};
		System.out.println(values[2]);
		
		//Multi dim array 
		int[][] grid = {
				{3,5,120},             //row 0 
				{1,7},                 //row 1
				{77,777,7777}          //row 2
		};
		
		//Accessing elements - say value 7 from above 
		
		System.out.println(grid[1][1]);
		
		
		//Create the array and initial later 
		String[][] texts = new String[2][3];  //2D array of references to strings default to null
		
		//Nesting through a 2D array  - printing with "print" instead of "println"
		for(int row = 0;row <grid.length;row++) 
		{
			for(int col = 0; col <grid[row].length;col++) 
			{
				//to print on the same line 
				System.out.print(grid[row][col] + "\t");
			}
			//to enter new row in  new line
			System.out.println();
		}
		
		//Another way of declaring multi dim array 
		
		String[][] words = new String[2][];
		
		System.out.println(words[0]);
		
		words[0] = new String[3];    //first row will have three elements
		words[0][1] = "Learnings!!";
		System.out.println(words[0][1]);
		
	}

}
