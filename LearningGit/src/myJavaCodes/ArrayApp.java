package myJavaCodes;

public class ArrayApp {

	public static void main(String[] args) {
		//reference variable and not a value variable - size is three
		//array elements are by default initialized to 0 
		
		int[] values;
		values = new int[3];  //new to allocate memory to hold 3 integers
		//OR 
		//int[] values = {1,0,0};
		
		System.out.println(values[0]);
		
		values[0] = 10;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		//When trying to access element not in array limit throws exception 
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//at myJavaCodes.ArrayApp.main(ArrayApp.java:21)

		//System.out.println(values[3]);
		
		//Looping thru the array elements
		for(int i = 0;i <values.length;i++) {
			System.out.println(values[i]);
		}
		
	}

}
