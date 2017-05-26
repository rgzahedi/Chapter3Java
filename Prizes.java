
public class Prizes {
	public static void main(String[] args) {

		int finalist1 = (int) ((Math.random() * 30) + 1);
		int finalist2 = (int) ((Math.random() * 30) + 1);
		int finalist3 = (int) ((Math.random() * 30) + 1);
		boolean keepPicking = true;
		while (keepPicking) {
			if ((finalist1 != finalist2) && (finalist1 != finalist3) && (finalist2 != finalist1)
					&& (finalist2 != finalist3) && (finalist3 != finalist1) && (finalist3 != finalist2)) {
				System.out.println("The finalists that have won the prize are: ");
				System.out.println(finalist1 + ", " + finalist2 + ", " + finalist3);
				keepPicking = false;
			} else {
				keepPicking = true;
			}
		}
	}
}
