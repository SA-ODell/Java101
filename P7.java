// P7 Assignment
// Author: Stephen O'Dell
// Date:   10/05/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

import java.util.Arrays;
// import java.lang.*;

public class P7 {
	
	public static int[] createIntegers() {
		int[] intArray = {16,21,34,49,55,60,72,83,101};
		return intArray;
	}
	
	public static double[] createDoubles() {
		double[] dubArray = new double[7];
		double j = 10.0;
		for (int i = 0; i < 7; i++) {
			dubArray[i] = j*j;
			j += 0.5;
		}
		return dubArray;
	}
	
	public static String[] createStrings(String inputString) {
		String[] modifiedStrings = new String[4];
		modifiedStrings[0] = inputString;
		modifiedStrings[1] = inputString.toUpperCase();
		modifiedStrings[2] = inputString.toLowerCase();
		modifiedStrings[3] = inputString.substring(1);

		return modifiedStrings;
		}
	
	public static char[] createChars(String inputString) {
		char[] myChars = new char[inputString.length()];
		for (int i = 0; i<inputString.length(); i++) {
			myChars[i] = inputString.charAt(i);
		}
		return myChars;
	}
	
	public static int sumArray(int[] inputIntArray) {
		int sum = 0;
		for (int i = 0; i < inputIntArray.length; i++) {
			sum += inputIntArray[i];
		}
		return sum;
	}
	
	public static double findLargest(double[] inputDoubleArray) {
		double maxVal = inputDoubleArray[0];
		for (int i = 0; i < inputDoubleArray.length; i++) {
			if (inputDoubleArray[i] > maxVal) 
				maxVal = inputDoubleArray[i];
			// alternative using Math.max
			// maxVal = Math.max(inputDoubleArray[i], maxVal);
		}
		return maxVal;
	}
	
	public static int charFrequency(String[] inputString, char myChar) {
		int counter = 0;
//		myChar = Character.toLowerCase(myChar);
		for (int i = 0; i < inputString.length; i++) {
			for (int j = 0; j < inputString[i].length(); j++) {
				if (myChar == (inputString[i].charAt(j)))
					counter++;
//				if (myChar == Character.toLowerCase(inputString[i].charAt(j)))
//					counter++;
			}
		}	return counter;
	}
	
	public static int[] translateChars(char[] charInputArray) {
		int[] asciiVals = new int[charInputArray.length];
		for (int i = 0; i < charInputArray.length; i++) {
			asciiVals[i] = (char)charInputArray[i];
		}
		return asciiVals;
	}

	
	public static void main(String[] args) {
		
		// Create arrays
        int[] integerArray = createIntegers();
        System.out.println(Arrays.toString(integerArray));
        double[] doubleArray = createDoubles();
        System.out.println(Arrays.toString(doubleArray));
        String[] stringArray = createStrings("Hello There");
        System.out.println(Arrays.toString(stringArray));
        char[] charArray = createChars("Java1234!&");
        System.out.println(Arrays.toString(charArray));

        // Test processing
        System.out.println("Sum of integer array = " + sumArray(integerArray));
        System.out.println("Largest of double array = " + findLargest(doubleArray));
        System.out.println("Frequency of 'e' = " + charFrequency(stringArray, 'e'));
        System.out.println("Translated characters = " + Arrays.toString(translateChars(charArray)));
        
        // More testing ...
//		int[] newIntArray = createIntegers();
//		System.out.println(Arrays.toString(newIntArray));
//		double[] newDubArray = createDoubles();
//		System.out.println(Arrays.toString(newDubArray));
//		String testString = "AaBbCcDdEeFf";
//		String[] newStringArray = createStrings(testString);
//		System.out.println(Arrays.toString(newStringArray));
//		char[] newCharsArray = createChars("abcdefgABCDEFG");
//		System.out.println(Arrays.toString(newCharsArray));
//		int sumAnswer = sumArray(createIntegers());
//		System.out.println(sumAnswer);
//		double answerMaxVal = findLargest(createDoubles());
//		System.out.println(answerMaxVal);
//		char testChar = 'e';
//		int charCounter = charFrequency(createStrings(testString), testChar);
//		System.out.println(charCounter);
//		System.out.println(Arrays.toString(translateChars(newCharsArray)));

	}

}


