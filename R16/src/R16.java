// R16 Assignment
// Author: Stephen O'Dell
// Date:   11/03/2017
// Class:  CS 164
// email:  saodell@cs.colostate.edu

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class R16 {
	
	public void readFile(String inputFile) {
		try {
			Scanner input = new Scanner(new File(inputFile));
			while (input.hasNext()) {
				if (input.hasNextDouble()) 
					System.out.println("Double: " + input.next());
				else if (input.hasNextInt())
					System.out.println("Integer: " + input.next());
				else if (input.hasNext())
					System.out.println("String: " + input.next());
				
			}
			input.close();
		}
		catch(Exception e) {
			System.out.println("Error encountered " + e.toString());
		}
	}

	public void writeFile( String outputFile ) {
		Scanner kb = new Scanner(System.in);
		File output = new File("output.txt");
		String userText;
		System.out.println("Enter text: ");
		userText = kb.nextLine();
		try {
			PrintWriter out = new PrintWriter(output);
			while (userText.compareToIgnoreCase("stop") != 0) {
				out.println(userText);
				userText = kb.nextLine();
			}
			out.close();
			kb.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		R16 r16 = new R16();
		r16.readFile(args[0]);
		r16.writeFile(args[1]);
	}

}


