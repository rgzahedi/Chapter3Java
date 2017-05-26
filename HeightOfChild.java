import java.util.*;

public class HeightOfChild {
	public static final int FOOT = 12;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Please input your gender: ");
			String gender = input.nextLine();
			System.out.println(
					"Please input the height of your mother(first number in feet then second number in inches): ");
			int heightInFeetMother = input.nextInt();
			int heightInInchesMother = input.nextInt();
			System.out.println(
					"Please input the height of your father(first number in feet then second number in inches): ");
			int heightInFeetFather = input.nextInt();
			int heightInInchesFather = input.nextInt();

			int inchesMother = heightInFeetMother * HeightOfChild.FOOT;
			int overallMother = inchesMother + heightInInchesMother;

			int inchesFather = heightInFeetFather * HeightOfChild.FOOT;
			int overallFather = inchesFather + heightInInchesFather;

			if (gender.equalsIgnoreCase("male")) {
				double heightForMale = (double) ((overallMother * (13 / 12.0)) + overallFather) / 2.0;
				int heightInFeetMaleChild = (int) (heightForMale / HeightOfChild.FOOT);
				int heightInInchesMaleChild = (int) (heightForMale % HeightOfChild.FOOT);
				System.out.println("The male child will be " + heightInFeetMaleChild + " feet and "
						+ heightInInchesMaleChild + " inches in adulthood.");
			} else if (gender.equalsIgnoreCase("female")) {
				double heightForFemale = (double) ((overallFather * (12 / 13.0)) + overallMother) / 2.0;
				int heightInFeetFemaleChild = (int) (heightForFemale / HeightOfChild.FOOT);
				int heightInInchesFemaleChild = (int) (heightForFemale % HeightOfChild.FOOT);
				System.out.println("The female child will be " + heightInFeetFemaleChild + " feet and "
						+ heightInInchesFemaleChild + " inches in adulthood.");
			}
			System.out.println("Would you like to exit now? Yes or No?");
			input.nextLine();
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("Yes")) {
				break;
			}
		}
		input.close();
	}
}
