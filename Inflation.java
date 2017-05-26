import java.util.*;

public class Inflation {
	public static final double PERCENT = 100.0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in the cost of the item: ");
		double costItem = input.nextDouble();
		System.out.println("How many years from now will you buy this item: ");
		double years = input.nextDouble();
		System.out.println("Please enter the rate of inflation: ");
		double inflationRate = input.nextDouble();
		double percentage = inflationRate / Inflation.PERCENT;
		for (int i = 0; i < years; i++) {
			double chunk = costItem * percentage;
			costItem = chunk + costItem;
		}
		System.out.printf("Therefore the cost is now %.2f after %.0f years", costItem, years);
		input.close();
	}
}
