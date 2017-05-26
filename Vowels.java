import java.util.*;
import java.io.*;

public class Vowels {
	public static void main(String[] args) {

		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}

		fileIn.hasNextLine();
		String vowelWord = null;
		int maxConsecutiveVowels = 0;
		while (fileIn.hasNext()) {
			String word = fileIn.next().toLowerCase();
			int consecutiveVowels = 0;
			for (int i = 0; i < word.length() && i < word.length() - maxConsecutiveVowels + consecutiveVowels; i++) {
				if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i')
						|| (word.charAt(i) == 'o') || (word.charAt(i) == 'u')) {
					consecutiveVowels++;
				} else {
					if (maxConsecutiveVowels <= consecutiveVowels) {
						maxConsecutiveVowels = consecutiveVowels;
						vowelWord = word;
					}
					consecutiveVowels = 0;
				}
			}
			if (maxConsecutiveVowels <= consecutiveVowels) {
				maxConsecutiveVowels = consecutiveVowels;
				vowelWord = word;
			}
		}
		System.out.println(vowelWord);
	}
}
