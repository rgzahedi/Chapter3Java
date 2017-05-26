import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean tryAgain = true;
		while (tryAgain) {
			System.out.println("Please enter in the number of pounds there is of green crud: ");
			int numberOfPounds = input.nextInt();
			System.out.println("Please enter in the number of days the green crud will endure: ");
			int numberOfDays = input.nextInt();
			assert (numberOfPounds > 0) && (numberOfDays > 0);
			assert ((numberOfDays % 5) == 0);
			int newPounds = 0;

			for (int i = 0; i <= (numberOfDays / 5); i++) {
				newPounds = newPounds + numberOfPounds;
				numberOfPounds = newPounds - numberOfPounds;
			}
			System.out.printf("Therefore there will be %d pounds of crud after %d days.\n", numberOfPounds,
					numberOfDays);
			System.out.println("Would you like to try again: ");
			input.nextLine();
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("No")) {
				tryAgain = false;
			} else {
				tryAgain = true;
			}
			assert (answer.equalsIgnoreCase("Yes")) || (answer.equalsIgnoreCase("No"));
		}
		input.close();
	}
}

/*
 * Make sure to know that if you are to do recursion without using certain
 * recursive formulas, then be advised that you first make two base cases where
 * one variable is 0 and the second one is 1, so for example, f = 0; n=1; then
 * we use a loop to see how many times we want to iterate this and then we say f
 * = f + n THEN n = f - n.
 */