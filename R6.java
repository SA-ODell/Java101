// Assignment
// Author: Stephen O'Dell
// Date: 
// Class: CS 164
// email: saodell@cs.colostate.edu

public class R6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// A, B, C
		String myString0 = "Java";
		String myString1 = "Programming";
		String myString2 = "Language";
		// D, E, F, G, H, I
		System.out.println(myString0 + " is a " + myString1 + " " + myString2);
		System.out.println("Length of myString1 & myString2 is: " + (myString1.length() + myString2.length() ) );
		System.out.println("2/4/7 characters: " + myString1.charAt(1) + myString1.charAt(3) + myString1.charAt(6) );
		System.out.println("Index of 'a' is: " + myString0.indexOf('a'));
		System.out.println("UpperCase myString2 is: " + myString1.toUpperCase());
		System.out.println("3-8 chars of Programming is: " + myString1.substring(2, 8));
		// P R O G R A M M I N G
		// 0 1 2 3 4 5 6 7 8 9 10
		// 3rd char = index 2, inclusive --> 2
		// 8th char = index 7, exclusive --> 8
		
		// J, K, L, M
		String myString3 = new String("Whatever!");
		String myString4 = new String("Whatever!");
		System.out.println("Does myString3 == myString4 ? Answer: " + myString3.equals(myString4));
		System.out.println("myString3 compared to myString4: " + myString3.compareTo(myString4));
				
		// N, O, P
		char c0 = '^';
		char c1 = 'G';
		char c2 = '7';
		System.out.println(c0 + "; " + c1 + "; " + c2);
		System.out.println((int)c0 + ", " + (int)c1 + ", " + (int)c2);
		
	}

}


