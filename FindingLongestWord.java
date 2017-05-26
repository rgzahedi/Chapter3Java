import java.util.*;
import java.io.*;

public class FindingLongestWord {
	public static void main(String[] args) {

		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}

		fileIn.hasNextLine();
		String longestWord = "";
		while (fileIn.hasNextLine()) {
			String longWord = fileIn.nextLine();
			String newString = "";
			for (int i = 0; i < longWord.length(); i++) {
				newString = longWord.charAt(i) + newString;
			}
			if (longWord.equalsIgnoreCase(newString)) {
				if (longestWord.length() < longWord.length()) {
					longestWord = longWord;
				}
			}
		}
		System.out.println(longestWord);
		fileIn.close();
	}
}
