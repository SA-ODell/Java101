// R9 Assignment
// Author: Stephen O'Dell
// Date: 09/27/2017
// Class: CS 164
// email: saodell@cs.colostate.edu

import java.util.Scanner;

public class R9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Math.pow()
//		double expo1 = Math.pow(double a, double b)
//		returns a^b
		
//		Math.sin()
//		double sine1 = Math.sin(double a)
//		returns trig sine of a
		
//		String.length()
		String myString1 = "12345";
		System.out.println(myString1.length());
//		no parameter, returns integer length of string
		
//		String.toUpperCase()
		String myString2 = "abcde";
		System.out.println(myString2.toUpperCase());
//		no parameter, returns new string converted to upper case
		
//		Scanner.hasNextDouble()
		Scanner keyboard = new Scanner(System.in);
		System.out.println(keyboard.hasNextDouble());
//		Returns true if the next token in this scanner's input can be 
//		interpreted as a double value using the nextDouble method. 
//		The scanner does not advance past any input.
//		Returns:
//		true if and only if this scanner's next token is a valid double value
//		Throws:
//		IllegalStateException - if this scanner is closed
		
		
		
//		System.out.println()
		System.out.println(" ");
//		Prints a String and then terminate the line. 
//		This method behaves as though it invokes print(String)
//		and then println().
//		Parameters:
//		x The String to be printed.
		
//		From the following calls, figure out what the return type and parameters might be:

//		int count = computeNumberOfLetters("Hello There!");
		// parameter --> string, 
		// return --> integer
//
//		double percent = findRatio(0.567f, 1.234f, 2.568f, 5.678f, 9.235f);
		// parameters --> float, 
		// return double
//
//		char special = someMethod(s.substring(1, 8), Character.isUpperCase(c), Math.pow(2.0, 3));
		// parameters: string, boolean, double
		// returns --> char 
//
//		String string = anotherMethod((int)'c', (int)'a', (char)78, (char)99, "Whatever");
//		// parameters --> integer, integer, char, char, string
		// returns --> string cancatonated from the above

	}

}


