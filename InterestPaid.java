
public class InterestPaid {
	public static final double MONTHLY_PAYMENT = 50;
	public static final double INTEREST = 0.015;

	public static void main(String[] args) {

		double overallSub = 1000;
		int monthCount = 0;
		double interestCount = 0;
		while (overallSub != 0) {
			double subInterest = InterestPaid.INTEREST * overallSub;
			double subPayment = InterestPaid.MONTHLY_PAYMENT - subInterest;
			overallSub = overallSub - subPayment;
			monthCount = monthCount + 1;
			interestCount = interestCount + subInterest;
			if (overallSub <= 50.0) {
				double newSubInterest = InterestPaid.INTEREST * overallSub;
				double newSubPayment = InterestPaid.MONTHLY_PAYMENT - newSubInterest;
				overallSub = overallSub - newSubPayment;
				if (overallSub < 0) {
					overallSub = 0;
				}
				interestCount = interestCount + newSubInterest;
				monthCount = monthCount + 1;
				break;
			}
		}
		System.out.printf("Therefore, it will take you %d months to pay off the loan debt you have.\n", monthCount);
		System.out.printf("Also the accumulated interest you paid after %d months is $%.2f.\n", monthCount,
				interestCount);
	}
}
