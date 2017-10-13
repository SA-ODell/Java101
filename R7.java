
// R7 Assignment
// Author: Stephen O'Dell
// Date:  09/20/2017
// Class: CS 164
// email: saodell@cs.colostate.edu

public class R7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test reverseString
		String forward = "Java Programming rules!";
		System.out.print("Forward string: ");
		System.out.println(forward);
		System.out.print("Reverse string: ");
		reverseString(forward);

		// Test printAscii
		System.out.println("ASCII Table");
		printAscii('!', '9');

		// Test raiseToPower
		System.out.printf("3.0 to the 5 = %.3f\n", raiseToPower(3.0, 5));
		System.out.printf("2.5 to the 2 = %.3f\n", raiseToPower(2.5, 2));
		System.out.printf("3.0 to the 0 = %.3f\n", raiseToPower(3.0, 0));
		System.out.printf("3.0 to the 1 = %.3f\n", raiseToPower(3.0, 1));
	}

	public static void reverseString(String s) {
		// add code here

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.print("\n");

	}

	public static void printAscii(char start, char end) {
		// add code here

		for (char i = start; i <= end; i++) {
			System.out.println((int)i + ": " + i);
		}
		System.out.print("\n");
	}

	public static double raiseToPower(double number, int exponent) {
		// add code here
		double result = 1.0;
		int i = 1;
		while (i <= exponent) {
			result = result * number;
			i++;
		}
		return result;
	}

}


// Question 1) What does the following loop output?
// for(int i = 5; i < 30; i+=5)
// System.out.println(i);
// 5
// 10
// 15
// 20
// 25

// Question 2) What does the following loop output?
// int j = 0;
// while (j <= 8) {
// System.out.println(++j); // preincrement operator!
// }
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9

// Question 3) What does the following loop output?
// for (int k = 7; k >= 0; k--);
// System.out.println(k);
// if you remove the semi-colon:
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// 0

// Question 4) What does the following loop output?
// for (int l = 0; l > 0; l++)
// System.out.println(l);

// (no output to console)

// Question 5) What does the following loop output?
// int m = 0;
// do {
// System.out.println(m--); // postincrement operator
// }
// while (m > 0);

// 0
