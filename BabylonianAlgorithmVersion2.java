import java.util.*;


public class BabylonianAlgorithmVersion2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a number n:");
		double n = input.nextDouble();
		double guess = n / 2.0;
		
		for(int i = 0; i < (0.99 * guess); i++) {
			double compute = n / guess;
			guess = (guess + compute) / 2.0;
		}
		System.out.printf("%.2f%n", guess);
		input.close();
	}
}
