import java.util.*;
import java.io.*;

public class FindingPairs {
	public static void main(String[] args) {

		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("integers.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		fileIn.hasNextInt();

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in a random number: ");
		int inputNumber = input.nextInt();

		String stringOfNumbers = "";
		int integer1 = 0;
		int integer2 = 0;
		while (fileIn.hasNextInt()) {
			integer1 = fileIn.nextInt();
			stringOfNumbers = stringOfNumbers + Integer.toString(integer1) + " ";
		}
		
		System.out.println(stringOfNumbers);
		while (fileIn.hasNextInt()) {
			integer2 = integer1;
			System.out.println(integer2);
		}
		System.out.println(inputNumber);
		
		input.close();
		fileIn.close();
	}
}
