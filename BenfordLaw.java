import java.util.*;
import java.io.*;

public class BenfordLaw {
	public static void main(String[] args) {

		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("engGrads.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		fileIn.hasNextInt();
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counter6 = 0;
		int counter7 = 0;
		int counter8 = 0;
		int counter9 = 0;
		while (fileIn.hasNextInt()) {
			int number = fileIn.nextInt();
			String numberString = Integer.toString(number);
			if (numberString.charAt(0) == '1') {
				counter1++;
			} else if (numberString.charAt(0) == '2') {
				counter2++;
			} else if (numberString.charAt(0) == '3') {
				counter3++;
			} else if (numberString.charAt(0) == '4') {
				counter4++;
			} else if (numberString.charAt(0) == '5') {
				counter5++;
			} else if (numberString.charAt(0) == '6') {
				counter6++;
			} else if (numberString.charAt(0) == '7') {
				counter7++;
			} else if (numberString.charAt(0) == '8') {
				counter8++;
			} else if (numberString.charAt(0) == '9') {
				counter9++;
			}
		}
		System.out.printf("For numbers starting with digit 1, there is a %.0f%% chance of it showing up.\n",
				((counter1 / 100.0) * 100.0));
		System.out.printf("For numbers starting with digit 2, there is a %.0f%% chance of it showing up.\n",
				((counter2 / 100.0) * 100.0));
		System.out.printf("For numbers starting with digit 3, there is a %.0f%% chance of it showing up.\n",
				((counter3 / 100.0) * 100.0));
		System.out.printf("For numbers starting with digit 4, there is a %.0f%% chance of it showing up.\n",
				((counter4 / 100.0) * 100.0));
		System.out.printf("For numbers starting with digit 5, there is a %.0f%% chance of it showing up.\n",
				((counter5 / 100.0) * 100.0));
		System.out.printf("For numbers starting with digit 6, there is a %.0f%% chance of it showing up.\n",
				((counter6 / 100.0) * 100.0));
		System.out.printf("For numbers starting with digit 7, there is a %.0f%% chance of it showing up.\n",
				((counter7 / 100.0) * 100.0));
		System.out.printf("For numbers starting with digit 8, there is a %.0f%% chance of it showing up.\n",
				((counter8 / 100.0) * 100.0));
		System.out.printf("For numbers starting with digit 9, there is a %.0f%% chance of it showing up.\n",
				((counter9 / 100.0) * 100.0));
	}
}
