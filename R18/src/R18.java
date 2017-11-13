// R18 Assignment
// Author: Stephen O'Dell
// Date:  11/10/2017
// Class: CS 164
// email: saodell@cs.colostate.edu

public class R18 implements IR18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R18 rec = new R18();
		//rec.starString(5);
		rec.starPattern(5);
		//rec.starString(9);
		rec.starPattern(10);

		System.out.println();
		System.out.println ("\'x\' is a palindrome?: " + rec.palindrome("x"));
		System.out.println("\'car\' is a palindrome?: " + rec.palindrome("car"));
		System.out.println("\'racecar\' is a palindrome?: " + rec.palindrome("racecar"));
		System.out.println("\'hannah\' is a palindrome?: " + rec.palindrome("hannah"));
		System.out.println("\'banana\' is a palindrome?: " + rec.palindrome("banana"));
		System.out.println("\'madamimadam\' is a palindrome?: " + rec.palindrome("madamimadam") + "\n");

	}

	@Override
	public String starString(int x) {
		if (x == 0) {// base case
			return "";
		}
		else {  // recursive case
		System.out.print("*");
		return starString(x-1);
		}
	}

	@Override
	public void starPattern(int x) {
		if (x == 0) // base case
			return;
		else {
			System.out.println(starString(x));
			x--;
			starPattern(x);
		}
		return;
		
	}

	@Override
	public boolean palindrome(String word) {
		int start = 0;
		int end = word.length() - 1;
		if (word.length() <= 1) // base case
			return true;
		else if (word.charAt(start) != word.charAt(end)) // second base case
			return false;
		else // recursive case
			// chop off ends, return substring minus head/tail
			return palindrome(word.substring(1, word.length()-1));
		
	}

}


