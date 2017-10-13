// P5 Assignment
// Author: Stephen O'Dell
// Date:   09/25/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		
		// Preliminary testing
	    printPrimes(100, 200);
	    System.out.println(removeVowels("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUu"));
	    double result = evaluateExponent(4.0, 5);
	    System.out.println("4.0 to the 5th = " + result);
	    computeStatistics(-1);

	}
	
	// Method to check whether an integer is prime.
	public static boolean isPrime(int number) {

	    // DO NOT CHANGE THIS CODE!
	    for(int i=2;i<=number/2;i++)
	        if(number%i==0)
	            return false;
	    return true;
	}

	// Method to print primes in a specified range
	public static void printPrimes(int start, int end) {
	    // add code here
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}
	


	// Method to remove vowels from a string
	public static String removeVowels(String input) {
	    // add code here
		String noVowels = "";
		for (int i = 0; i <= input.length()-1; i++) {
			switch (input.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					break;
				default:
					noVowels = noVowels + input.charAt(i);
					break;
			}
		}
		return noVowels;
	}

	// Method to generate and print the value of a number raised to an exponent
	public static double evaluateExponent(double number, int exponent) {
	    // add code here
		double result = 1.0;
		if (exponent == 0) {
			return result;
		} else {
			int loop = 0;
			do {
				result = result * number;
				loop ++;
			}
			while (loop < exponent);
			return result;
		}
		// refactored solution:
		// only seven lines, includes check for exponent == 0
		//
		// double result = 1.0;
		// int i = 1;
		// while (i <= exponent) {
		//	  result = result * number;
		//	  i++;
		// }
		// return result;
		
		
	}

	// Method to find and print the minimum/maximum/mean of a set of positive numbers
	public static void computeStatistics(int sentinel) {
		// Instantiate scanner
		Scanner keyboard = new Scanner(System.in);
		
		int value = 0;
		int count = 0;
		double mean = 0.0;
		int maximum = Integer.MIN_VALUE;
		int minimum = Integer.MAX_VALUE;
		
		while (true) {
			value = keyboard.nextInt();
			if (value == sentinel) {
				break;
			}
			else {
				if (value < minimum) {
					minimum = value;
				}
				if (value > maximum) {
					maximum = value;
				}
				mean = value + mean;
				count++;
			}
		}
		mean = mean / count;
		System.out.println("Count: " + count);
		System.out.println("Average: " + mean);
		System.out.println("Maximum: " + maximum);
		System.out.println("Minimum: " + minimum);

	}	

}


