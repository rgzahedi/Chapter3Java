import java.io.*;
import java.util.*;

public class ExerciseReader {
	public static final int INCHES_TO_FEET = 12;
	public static final int HEIGHT = 5;
	public static final int WEIGHT = 110;

	public static void main(String[] args) {

		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("FeetInches.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		fileIn.hasNextLine();
		while (fileIn.hasNextLine()) {
			String name = fileIn.nextLine();
			int feet = fileIn.nextInt();
			int inches = fileIn.nextInt();
			int rem = (feet / ExerciseReader.HEIGHT) * ExerciseReader.WEIGHT;
			int addWeight = ((feet - ExerciseReader.HEIGHT) * ExerciseReader.INCHES_TO_FEET) * 5;
			int addMoreWeight = (inches) * 5;
			int overallWeight = rem + addWeight + addMoreWeight;
			System.out.println(name + " " + overallWeight);
			fileIn.nextLine();
		}
		fileIn.close();
	}
}
