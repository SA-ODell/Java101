// R19 Assignment
// Author: Stephen O'Dell
// Date: 11/17/2017
// Class: CS 164
// email: saodell@cs.colostate.edu

public class R19 implements IR19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R19 test = new R19();
		System.out.println("sumDigits(int x):");
		System.out.println("Answer (1234): " + test.sumDigits(1234) + "   Expecting: 10");
		System.out.println("Answer (7): " + test.sumDigits (7) + "   Expecting: 7");
		System.out.println("Answer (6789): " + test.sumDigits (6789) + "  Expecting: 30");
		System.out.println();

		System.out.println("countCannonballs (int x):");
		System.out.println("Answer (1): " + test.countCannonballs(1) + "   Expecting: 1");
		System.out.println("Answer: " + test.countCannonballs (4) + "   Expecting: 30");
		System.out.println("Answer (10): " + test.countCannonballs (10) + "   Expecting 385");
		System.out.println();
//		
		System.out.println("numDigits(int x):");
		System.out.println("Answer (1234): " + test.numDigits(1234) + "   Expecting: 4");
		System.out.println("Answer (7): " + test.numDigits (7) + "   Expecting: 1");
		System.out.println("Answer (678900): " + test.numDigits (678900));
		System.out.println();
//
		System.out.println("backString(String s):");
		System.out.println("Answer (yes): " + test.backString("yes"));
		System.out.println("Answer (): " + test.backString(""));
		System.out.println("Answer (a): " + test.backString("a"));
		System.out.println();
		System.out.println("Answer (CS163): " + test.backString("CS163"));

	}

	@Override
	public int sumDigits(int n) {
		//  1234/10 = 123, 1234%10 = 4
		int tempSum1 = 0;
		if (n == 0) // base case
			return tempSum1;
		else {  // recursive case
				// mod-10 extracts last digit, int-div-10 removes tens
			tempSum1 = n % 10 + sumDigits(n / 10);
			return tempSum1;
		}
		
	}

	@Override
	public int countCannonballs(int n) {
		// Level:  1 --> 1; 2 --> 4; 3 --> 9;
		// Then need to add up all levels
		int tempSum2 = 0;
		// int counter = 0;
		if (n == 0) { // base case
			tempSum2 = 0;
			return tempSum2;
		}
		else { // recursive case, n^2 + previous, counting backwards
			tempSum2 = n * n  + countCannonballs(n-1);
			return tempSum2;
		}
		
	}

	@Override
	public int numDigits(int n) {
		// number of digits in base 10 number
		if (n >= 0) { // test precondition
			if (n < 10) { // base case 
				return 1;
			}
			else { // recursive case
				return (numDigits(n/10) + 1);
			}	
			// need help understanding final return --> n, null, 1?
		} return n;
	}

	@Override
	public String backString(String s) {
		// reverse string:  yes --> sey
		String tempStr = ""; // temp string to hold string in reversed order
		// do not reverse string --> create new string in backwards order
		if (s.length() <= 1) // base case --> shrunk string to nothing
			return s;
		else {  // recursive case --> swap chars into temp string
			// temp = nada; temp = temp + last digit of old string
			tempStr = tempStr + s.charAt(s.length()-1) 
			+ backString(s.substring(0, s.length()-1));
			// ?? is original string being altered?
			System.out.println("tempStr = " + tempStr);
			System.out.println("original string = " + s);
			return tempStr;
		}
	}
}


