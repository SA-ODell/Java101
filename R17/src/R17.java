// Assignment
// Author: Stephen O'Dell
// Date: 
// Class: CS 164
// email: saodell@cs.colostate.edu

public class R17 implements IR17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R17 rec = new R17();
		System.out.println("pracSeq1(int x):");
		System.out.println("Answer: " + rec.pracSeq1(5) + "   Expecting: 32");
		System.out.println("Answer: " + rec.pracSeq1(7) + "   Expecting: 128\n");

		System.out.println("sequence(int x):");
		System.out.println("Answer(4): " + rec.sequence2(4) + "   Expecting: 11");
		System.out.println("Answer(5): " + rec.sequence2(5) + "   Expecting: 20");
		System.out.println("Answer(6): " + rec.sequence2(6) + "   Expecting: 37");
		System.out.println("Sequence: 1, 2, 3, 6, 11, 20, 37\n");
//
		System.out.println("sequence3:");
		System.out.println("Answer(2): " + rec.sequence3(2) + "   Expecting: 7");
		System.out.println("Answer(3): " + rec.sequence3(3) + "   Expecting: 20");
		System.out.println("Answer(4): " + rec.sequence3(4) + "   Expecting: 61");
		System.out.println("Answer(6): " + rec.sequence3(6) + "   Expecting: 547");
		System.out.println("Sequence:  1, 2, 7, 20, 61, 182, 547\n");

	}

	@Override
	public int pracSeq1(int n) {
		// TODO Auto-generated method stub
		// initialize local variables
		
		if (n==0)  // base case
			return 1;
		
		return 2*pracSeq1(n-1); // recursive case
	
		// seq(3) = seq(2) * 2
		// seq(2) = seq(1) * 2
		// seq(1) = seq(0) * 2
		// seq(0) = 1

	}

	@Override
	public int sequence2(int n) {
		if (n == 0) // base case
			return 1;
		else if (n == 1) // base case
			return 2;
		else if (n == 2) // base case
			return 3;
		else // recursive calls
			return sequence2(n-1) + sequence2(n-2) + sequence2(n-3);
	}

	@Override
	public int sequence3(int n) {
		// TODO Auto-generated method stub
		if (n == 0) // base case
			return 1;
		else if (n == 1) // base case
			return 2;
		else if (n==2) // base case
			return 7;
		else // recursive calls
			return 2*sequence3(n-1) + 3*sequence3(n-2);
	}

}


