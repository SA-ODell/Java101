// Q2 Assignment
// Author: Stephen O'Dell
// Date:   10/11/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

public class Pseudo {
	
	public static char charAt(char[] myArray, int myIndex) {
		char foundChar = myArray[myIndex];
		return foundChar;
		
	}
	
	public static int indexOf(char[] myArray, char myChar) {
		int myIndex = 0;
		for (int i = 0; i < myArray.length;i++) {
			if (myChar == myArray[i])
				myIndex = i;
		}
		return myIndex;
	}
	
	public static String toUpperCase(char[] myArray) {
		String myString = "";
		for (int i = 0; i < myArray.length; i++ ) {
			myString += Character.toUpperCase(myArray[i]);
		}
		return myString;

	}

	public static void main(String[] args) {
		
		// verify class
		char[] test = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ', 'C', 'o', 'm', 'p', 'u', 't', 'e', 'r', ' ', 'S', 'c', 'i', 'e', 'n', 'c', 'e', ' ', '!', '(', '*', '@', '&', '#', ')', '*'};
		
		
		System.out.println("Verifying Pseudo: ");
		
		System.out.println("charAt(test,5) = " + charAt(test,5));
		System.out.println("indexOf(test,'C') = " + indexOf(test, 'C'));
		System.out.println("toUpperCase(test) = " + toUpperCase(test));
		
		// String equivalent (should match)
		System.out.println("\nComparing String:");
		String string = "1234567890 Computer Science !(*@&#)*";
		System.out.println("string = " + string);
		System.out.println("string.charAt(5) = " + string.charAt(5));
		System.out.println("string.indexOf('C') = " + string.indexOf('C'));
		System.out.println("string.toUpperCase() = " + string.toUpperCase());


	}

}


