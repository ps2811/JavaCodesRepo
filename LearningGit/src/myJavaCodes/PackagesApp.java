package myJavaCodes;

import myJavaCodes.oceans.Fish;

//package names are by convention all lower case 
//organize the code 
//help avoid name conflicts 
//always the first line in the code 
//package naming convention - "com.websitename.whatevername
//can create a package within a packge - use myJavacodes.innerpackagename - while specifying package
//import the package whose class (fish ) needs to be accessed.
public class PackagesApp {

	public static void main(String[] args) {
	 Fish f1 = new Fish();
	 f1.showInfo();
	 
	}

}
