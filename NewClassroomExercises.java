import java.text.DecimalFormat;
import java.util.*;

public class NewClassroomExercises {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("How many exercises to input? ");
		int numExercises = input.nextInt();
		int counter = 1;
		double overallScore = 0;
		double overallTotal = 0;

		while (counter <= numExercises) {
			System.out.println("Score recieved for exercise " + counter + ": ");
			int score = input.nextInt();
			double newScore = (double) (score);
			System.out.println("Total points possible for exercise " + counter + ": ");
			int total = input.nextInt();
			double newTotal = (double) (total);
			input.nextLine();
			overallScore = overallScore + newScore;
			overallTotal = overallTotal + newTotal;
			counter++;
		}
		double percent = overallScore / overallTotal;
		DecimalFormat percentage = new DecimalFormat("##0.00%");
		System.out.println("Your total is " + (int) overallScore + " out of " + (int) overallTotal + ", or "
				+ percentage.format(percent) + ".");
		input.close();
	}
}
