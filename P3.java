// P3 Assignment
// Author: Stephen O'Dell
// Date:   09/11/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

import java.util.Scanner;

public class P3 {
	
	public static String evaluate (String expression)  {
		
		// Print expression to console:
		System.out.println(expression);
		
		// Declare variables for operands, operator, result, and return  value
		
		double firstOperand = 0.0;
		double secondOperand = 0.0;
		String operator = "";
		double result = 0.0;
		// next line provided in project instructions:
		String returnString = "";
		
		// Create Scanner object to parse expression
		Scanner myCalculator = new Scanner(expression);
		// note: not using Scanner(System.in)

		// Use Scanner to read operands and operator
		
		// checking whether we're parsing Scanner correctly
		// System.out.println(calculator.hasNextDouble() );
		// System.out.println(calculator.hasNext());
		// System.out.println(calculator.hasNextDouble() );
		
		
		// not elegant but gets the job done:
		if (myCalculator.hasNextDouble() ) {
			firstOperand = myCalculator.nextDouble();
		}
		else {
			return "Invalid Operand!";
		}
		
		if (myCalculator.hasNext() ) {
			operator = myCalculator.next();
		}
		else {
			return "Invalid Operator!";
		}

		if (myCalculator.hasNextDouble() ) {
			secondOperand = myCalculator.nextDouble();
		}
		else {
			return "Invalid Operand!";
		}
		
		// Note: using "return" and not "System.out"
		// because we're returning that value to the 
		// calculator display 
		
		// Compute a numerical result for the expression
		switch(operator) {
		  case "+": 
			  result = firstOperand + secondOperand;
			  returnString = Double.toString(result);
			  break;
		  case "-":
			  result = firstOperand - secondOperand;
			  returnString = Double.toString(result);
			  break;
		  case "*":
			  result = firstOperand * secondOperand;
			  returnString = Double.toString(result);
			  break;
		  case "/":
			  result = firstOperand / secondOperand;
			  returnString = Double.toString(result);
			  break;
		  case "%":
			  result = firstOperand % secondOperand;
			  returnString = Double.toString(result);
			  break;
		  case "^":
			  result = Math.pow(firstOperand, secondOperand);
			  returnString = Double.toString(result);
			  break;
			  
		  default: 
			  return "Invalid Operator!";
		}
		
		myCalculator.close();
		// Convert numerical result to string --> included in Switch statement
		
		
		// return result
		return returnString;
		
		
	}

}


