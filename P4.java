// P3 Assignment
// Author: Stephen O'Dell
// Date: 9/14/2017
// Class: CS 164
// email: saodell@cs.colostate.edu

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Instantiate scanner
		Scanner keyboard = new Scanner(System.in);
		
		// 2-4. Declare variables
		double grossSalary = 0;
		double interestIncome = 0;
		double capitalGains = 0;
		int exemptions = 0;
		double totalIncome = 0;
		double adjustedIncome = 0;
		double federalTax = 0;
		double stateTax = 0;
		
		// 5-12 Prompt: gross salary, exemptions, interest income, capital gains
		System.out.print("Salary: ");
		grossSalary = keyboard.nextDouble();
		
		System.out.print("Exemptions: ");
		exemptions = keyboard.nextInt();
		
		System.out.print("Interest: ");
		interestIncome = keyboard.nextDouble();
		
		System.out.print("Gains: ");
		capitalGains = keyboard.nextDouble();
		
		// 13-16. Calculate fed total income, adjusted income, fed tax, state tax
		
		totalIncome = grossSalary + interestIncome + capitalGains - 5000;
		
		if (exemptions > 6) exemptions = 6;
		
		adjustedIncome = totalIncome - (exemptions * 1500.00);
		
		if (adjustedIncome > 50000) {
			federalTax = ((adjustedIncome - 50000.00)*0.28) + 3450 + 1950;
		} 
		else if (adjustedIncome > 35000) {
			federalTax = ((adjustedIncome - 35000.00)*0.23) + 1950;
		} 
		else if (adjustedIncome > 20000) {
			federalTax = ((adjustedIncome - 20000.00)*0.13);
		}
		else {
			federalTax = 0;
		}
		
		stateTax = adjustedIncome * 0.065;
		
		
		// 17-24. Print total income, adjusted income, fed tax, state tax
		System.out.printf("Total Income: $%.2f\n", totalIncome);
		System.out.printf("Adjusted Income: $%.2f\n", adjustedIncome);
		System.out.printf("Total Tax: $%.2f\n", federalTax);
		System.out.printf("State Tax: $%.2f\n", stateTax);
	
		// check for end of line \n
		// close Scanner
		keyboard.close();

	}

}


