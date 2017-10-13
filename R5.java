// R5 Assignment
// Author: Stephen O'Dell
// Date:   09/06/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

import java.util.Scanner;

public class R5 {

	public static void main(String[] args) {
		
		// Boolean Variables
		boolean boolean0 = true;
		boolean boolean1 = false;
		
		System.out.println("boolean0 is " + boolean0);
		System.out.println("boolean1 is " + boolean1);
		
		// Comparison Operators
		
		boolean equals = (11 == 33);
		boolean notEquals = (22 != 44);
		boolean greaterThan = (15 > 25);
		boolean lessThan = (-11 < 13);
		
		System.out.println("(11 == 33) is " + equals);
		System.out.println("(22 != 44) is " + notEquals);
		System.out.println("(15 > 25) is " + greaterThan);
		System.out.println("(-11 < 13) is " + lessThan);
		
		// Conditionals Statements
		
		Scanner keyboard = new Scanner(System.in);
		
		int integer0, integer1;
		System.out.print("Enter first integer: ");
		integer0 = keyboard.nextInt();
		System.out.print("Enter second integer: ");
		integer1 = keyboard.nextInt();
		
		if (integer0 > integer1) {
			System.out.println("First integer is larger than the second.");
		}
		else if (integer0 < integer1) {
			System.out.println("Second integer is larger than the first.");
		}
		else {
			System.out.println("Both integers are equal.");
		}
		
		// Switch Statements
		
		String myString;
		System.out.print("Enter a state: ");
		myString = keyboard.next();
		// check for geographical orientation
		
		switch (myString) {
			case "Alabama":
			case "Florida":
				System.out.println("Southern State");
				break;
			case "Colorado":
			case "Utah":
				System.out.println("Western State");
				break;
			case "Michigan":
			case "Wisconsin":
				System.out.println("Northern State");
				break;
			case "Deleware":
			case "Maine":
				System.out.println("Eastern State");
				break;
				
			default:
				System.out.println("Not sure where that is, must be in the Midwest!");
				
		}
		
		keyboard.close();
		
	}

}


