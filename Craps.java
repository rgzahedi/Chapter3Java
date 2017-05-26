
public class Craps {
	public static void main(String[] args) {

		int dieSum1 = 0;
		double winnerCount = 0;
		double loserCount = 0;

		for (int i = 0; i < 10000; i++) {
			int die1 = (int) (Math.random() * 6) + 1;
			int die2 = (int) (Math.random() * 6) + 1;
			dieSum1 = die1 + die2;
			if (dieSum1 == 7 || dieSum1 == 11) {
				winnerCount = winnerCount + 1;
			} else if (dieSum1 == 2 || dieSum1 == 3 || dieSum1 == 12) {
				loserCount = loserCount + 1;
			} else {
				int dieSum2 = 0;
				while (dieSum2 != 7 || dieSum2 != dieSum1) {
					int die3 = (int) (Math.random() * 6) + 1;
					int die4 = (int) (Math.random() * 6) + 1;
					dieSum2 = die3 + die4;
					if (dieSum2 == 7) {
						loserCount = loserCount + 1;
						break;
					} else if (dieSum2 == dieSum1) {
						winnerCount = winnerCount + 1;
						break;
					}
				}
			}
		}
		double probability = (winnerCount / (winnerCount + loserCount)) * 100;
		System.out.printf("The probability of you winning is %.1f", probability);
		System.out.print("%\n");
		if (probability > 50.0) {
			System.out.println("Therefore you are going to win the most!");
		} else if (probability == 50.0) {
			System.out.println("It's even steven!");
		} else {
			System.out.println("The house is going to win I'm afraid...");
		}
	}
}
