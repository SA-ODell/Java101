// import java.util.Arrays;

// R11 Assignment
// Author: Stephen O'Dell
// Date:   10/04/17
// Class:  CS 164
// email:  saodell@cs.colostate.edu

import java.util.Arrays;

public class R11 {
	
	public static double arrayAverage(double[] inputArray ) {
		double inputAverage = 0;
		for (int i = 0; i < inputArray.length; i++) {
			inputAverage += inputArray[i];
		}
		inputAverage = inputAverage/(inputArray.length-1);
		return inputAverage;
	}
	

	public static void main(String[] args) {
		// Create a 5 element array of doubles called grades that contains 
		// the following numbers in this order: 81.2, 92.5, 48.9, 78.8, and 45.5.
		double[] grades = {81.2, 92.5, 48.9, 78.8, 45.5};
	
		
		// Create a 7 element array of ints called numbers that contains 
		// the following numbers in this order: 12, 42, 33, 67, 92, 58, and 33.
		int [] numbers = {12,42,33,67,92,58,33};
		
		
		// Create a 9 element array of Strings called arguments 
		// without using an array initializer.
		String[] arguments = new String[9];
		
		System.out.println("Length of grades: " + grades.length);
		System.out.println("Length of numbers: " + numbers.length);
		System.out.println("Length of arguments: " + arguments.length);
		System.out.println("1st element of grades: " + grades[0]);
		System.out.println("3rd element of grades: " + grades[2]);
		System.out.println("Last element of numbers: " + numbers[numbers.length-1]);
		
		grades[grades.length-2] = 90.5;
		numbers[2] = 99;
		
		for (int i=0;i<arguments.length;i++) {
			arguments[i] = "C++";
		}
		for (int i=0;i<6;i++) {
			arguments[i] = "Java";
		}
		
		System.out.print("All elements of grades: ");
		for (int i=0;i<grades.length;i++) {
			System.out.print(grades[i] + ",");
		}
		System.out.print("\n");
		
		System.out.print("All elements of numbers: ");
		for (int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.print("\n");
		
		System.out.print("All elements of arguments: ");
		for (int i = 0;i<arguments.length;i++){
			System.out.print(arguments[i] + "_");
		}
		System.out.print("\n");
		
		System.out.println("Arrays.toString(grades): " + Arrays.toString(grades));
		System.out.println("Arrays.toString(numbers): " + Arrays.toString(numbers));
		System.out.println("Arrays.toString(arguments): " + Arrays.toString(arguments));
		
		System.out.printf("Average grade: %.3f %n", arrayAverage(grades));
	}

}





