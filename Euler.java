import java.util.*;

public class Euler {
	public static void main(String[] args) {
		/*
		 * Make sure that n > 0 always because that is how the summation works
		 * for e^x.
		 */

		Scanner input = new Scanner(System.in);
		boolean isDone = true;

		while (isDone) {
			System.out.println("Please input a value for x: ");
			double x = input.nextDouble();

			System.out.println("Please input a value for n: ");
			double n = input.nextDouble();
			double overallE = 1;
			double i = 1;
			double j = 0;
			double x1 = 1;
			double k = 0;
			for (int z = 0; z < n; z++) {
				while (j < n) {
					j = j + 1;
					if (i >= 2) {
						i = j * i;
					} else {
						i = j * i;
					}
					break;
				}

				while (k < n) {
					x1 = x1 * x;
					k = k + 1;
					break;
				}
				overallE = overallE + (x1 / i);
			}
			System.out.printf("The answer is %f.\n", overallE);
			System.out.println("Do you still need the Euler calculator: ");
			input.nextLine();
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("No")) {
				isDone = false;
			} else {
				isDone = true;
			}
			assert (answer.equalsIgnoreCase("Yes")) || (answer.equalsIgnoreCase("No"));
		}
		input.close();
	}
}
