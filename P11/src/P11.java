import java.util.ArrayList;

// P11 Assignment
// Author: Stephen O'Dell
// Date:   11/11/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

public class P11 implements IP11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		P11 test = new P11();
		test.printPattern(5);
		
	}

	@Override
	public void printPattern(int n) {
		// TODO Auto-generated method stub
		
		if (n == 0) {
			
		}
		
		
	}
		
	public String starString(int x) {
		if (x == 0) {// base case
			return "";
		}
		else {  // recursive case
		System.out.print("*");
		return starString(x-1);
		}
	}
	
	public String dashString(int x) {
		if (x == 0) {// base case
			return "";
		}
		else {  // recursive case
		System.out.print("-");
		return starString(x-1);
		}
	}
	

	 


	@Override
	public int convertNum(int[] num) {
		// TODO Auto-generated method stub
		
		if (num.length > 0) {
			
			
			
		}
		
		
		
		
		return 0;
	}

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		// TODO Auto-generated method stub
		
		
		
		
		return null;
	}

}


