// Assignment R4
// Author: Stephen O'Dell
// Date:   09/01/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {

		// Operator precedence, integer math
		System.out.println(2 - 23 % 10 + 3 * 12 - 20);

		// Operator precedence, floating-point math
		System.out.println(2.4 + 23.1 - 10.0 * 3.1 - 12.5 / 6.25);

		// Operator precedence, mixed math
		System.out.println(65 % 15 + 3.5 * (5 / 2));

		int A;
		int B;
		int C;
		double positiveRoot;
		double negativeRoot;

		Scanner elsa = new Scanner(System.in);
		System.out.println("Enter coefficient A: ");
		A = elsa.nextInt();
		System.out.println("Enter coefficient B: ");
		B = elsa.nextInt();
		System.out.println("Enter coefficient C: ");
		C = elsa.nextInt();
		System.out.println("Formula: " + A + "x^2 + " + B + "x + " + C);

		// https://en.wikipedia.org/wiki/Quadratic_equation
		// x = (-b +/- (sqrt (b^2 - 4ac) ) ) / (2a)

		positiveRoot = ((-1 * B) + Math.sqrt((B * B) - (4 * A * C))) / (2 * A);
		System.out.println("Positive root: " + positiveRoot);
		negativeRoot = ((-1 * B) - Math.sqrt((B * B) - (4 * A * C))) / (2 * A);
		System.out.println("Negative root: " + negativeRoot);

		elsa.close();

	}
}
