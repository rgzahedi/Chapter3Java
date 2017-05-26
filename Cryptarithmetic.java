
public class Cryptarithmetic {
	public static void main(String[] args) {

		for (int t = 0; t <= 9; t++) {
			for (int o = 0; o <= 9; o++) {
				for (int g = 0; g <= 9; g++) {
					for (int d = 0; d <= 9; d++) {
						if ((d != t) && (d != o) && (d != g) && (t != g) && (t != o) && (t != d) && (o != t) && (o != g)
								&& (o != d) && (g != t) && (g != o) && (g != d)) {
							String stringT = Integer.toString(t);
							String stringO = Integer.toString(o);
							String stringG = Integer.toString(g);
							String stringD = Integer.toString(d);
							String stringTOO = stringT + stringO + stringO;
							String stringGOOD = stringG + stringO + stringO + stringD;
							int TOO = Integer.parseInt(stringTOO);
							int GOOD = Integer.parseInt(stringGOOD);
							if ((TOO + TOO + TOO + TOO) == GOOD) {
								System.out.println("T = " + t + ", O = " + o + ", G = " + g + ", D = " + d);
							}
						}
					}
				}
			}
		}
	}
}
