// Assignment
// Author: Stephen O'Dell
// Date: 
// Class: CS 164
// email: saodell@cs.colostate.edu

public class R10 {

	public static void main(String[] args) {
		// #2/3 area of a circle
		System.out.printf("%10.3f %n", circleArea(2.0));
		
		// #4 volume of a sphere
		System.out.printf("%10.3f %n", sphereVolume(3.0));
		
		// #5 round a positive number
		System.out.printf("%10d %n", round(4.9999999));
		
		// #6 reverse case
		String testString = "AaBbCcDdEe";
		System.out.println(testString + " --> " + reverseCase(testString));

	}
	
	// #2/3 area of a circle
	public static double circleArea(double myRadius) {
		double myArea = myRadius * myRadius * Math.PI;
		return myArea;
	}
	
	// #4 volume of a sphere
	public static double sphereVolume(double myRadius) {
		double myVolume = Math.pow(myRadius, 3.0) * Math.PI * 4 / 3;
		return myVolume;
	}
	
	// #5 rounded a number up
	public static int round(double input) {
		if (input < 0.0) {
			System.out.println("Not a positive number");
			return 0;
		} 
		else {
		int roundedNum = (int)Math.floor(input + 0.5);
		return roundedNum;
		}
	}
	
	// #6 reverse the case of an alphabetic string
	public static String reverseCase(String myString) {
		String myNewString = "";
		for (int i = 0; i < myString.length(); i++) {
			if (Character.isUpperCase(myString.charAt(i))) {
				myNewString += Character.toLowerCase(myString.charAt(i));
			} 
			else {
				myNewString += Character.toUpperCase(myString.charAt(i));
			}
		}
		return myNewString;
	}

}


