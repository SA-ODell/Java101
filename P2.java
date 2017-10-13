// P2 Assignment Solution
// Author: Stephen O'Dell
// Date:   09/03/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		
		// Declare variables for geometric formulas
		double radius;
		double circumference;
		double area;
		double volume;
		
		// Instantiate scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt and read radius from the keyboard
		
		System.out.print("Radius? ");
		radius = keyboard.nextDouble();
		
		// Calculate circumference, area, and volume
		circumference = 2 * radius * Math.PI;
		area = Math.PI * Math.pow(radius, 2.0);
		volume = ( (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0) );
		
		// Print circumference, area, and volume to console
		System.out.printf("The circumference is %.5f" + ".%n", circumference);
		System.out.printf("The area is %.5f" + ".%n", area);
		System.out.printf("The volume is %.5f" + ".%n", volume);
		
		// Declare variables for converting mass to energy
		double energy;
		double mass;
		double speedOfLight = 299792458.0;
		
		// Prompt and read mass from the keyboard
		
		System.out.print("Mass? ");
		mass = keyboard.nextDouble();
		
		// Computer the energy using the formula
		energy = mass * Math.pow(speedOfLight, 2.0);
		
		// Print energy to the console
		System.out.printf("The energy is %.1f" + " joules.%n", energy);
		
		// Close scanner (keyboard)
		keyboard.close();

	}

}


