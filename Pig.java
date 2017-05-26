import java.util.*;

public class Pig {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the game of Pig where you will be playing with the CPU!");
		System.out.printf("The rules of the game are that you must accumulate 100 points or more\n"
				+ "to win. You roll a die and if you roll a 1, then that means you get no new points\n"
				+ "and it becomes the other players turn. But if the player rolls a 2 through 6, then\n"
				+ "you can either ROLL AGAIN or HOLD where the sum of all rolls are added to the player's\n"
				+ "score and then it becomes the other player's turn. If you would like to roll again, then\n"
				+ "enter \"r\" but if you want to hold then enter \"h\".\n\n");
		System.out.println("Are you ready to play?(y/n) ");
		String yesOrNo = input.nextLine();
		if (yesOrNo.equalsIgnoreCase("n")) {
			System.out.println("Okay then come back later if you want to play");
		} else if (yesOrNo.equalsIgnoreCase("y")) {
			System.out.println("Then let us start the game now!");
			boolean player1Game = true;
			boolean player2Game = true;
			boolean wholeGame = true;
			int humanPoints = 0;
			int middleHumanPoints = 0;
			int computerPoints = 0;
			int middleComputerPoints = 0;
			int rollNumber = 0;
			while (wholeGame) {
				System.out.println("It is now your turn to roll.");
				while (player1Game) {
					rollNumber = rollNumber + 1;
					System.out.printf("The Score: You: " + humanPoints + "\tComputer: " + computerPoints + "\n\n");
					System.out.printf("The current roll we are on now is: " + rollNumber + "\n\n");
					int player1Roll = (int) (Math.random() * 6) + 1;
					System.out.println("You have just rolled a " + player1Roll + ".");
					if (player1Roll == 1) {
						middleHumanPoints = 0;
						player1Game = false;
						player2Game = true;
					} else {
						System.out.println("Would you like to roll again or hold on?(r/h) ");
						String rollOrHold = input.nextLine();
						if (rollOrHold.equalsIgnoreCase("r")) {
							middleHumanPoints = middleHumanPoints + player1Roll;
							player1Game = true;
							player2Game = false;
						} else if (rollOrHold.equalsIgnoreCase("h")) {
							middleHumanPoints = middleHumanPoints + player1Roll;
							humanPoints = humanPoints + middleHumanPoints;
							player1Game = false;
							player2Game = true;
							middleHumanPoints = 0;
							if (humanPoints >= 100) {
								System.out.println("You've won! Congratulations!!!");
								System.out.printf(
										"The Score: You: " + humanPoints + "\tComputer: " + computerPoints + "\n\n");
								player1Game = false;
								player2Game = false;
								wholeGame = false;
							}
						}
						assert (rollOrHold.equalsIgnoreCase("r")) || (rollOrHold.equalsIgnoreCase("h"));
					}
				}
				System.out.println("It is now the computer's turn to roll.");
				while (player2Game) {
					rollNumber = rollNumber + 1;
					int player2Roll = (int) (Math.random() * 6) + 1;
					System.out.println("The computer has just rolled a " + player2Roll + ".");
					if (player2Roll == 1) {
						middleComputerPoints = 0;
						player1Game = true;
						player2Game = false;
					} else {
						middleComputerPoints = middleComputerPoints + player2Roll;
						int scoreLimit = 20;
						while ((middleComputerPoints <= scoreLimit) || (middleComputerPoints >= scoreLimit)) {
							if (middleComputerPoints >= scoreLimit) {
								computerPoints = computerPoints + middleComputerPoints;
								System.out.println("The computer has decided to hold.");
								player1Game = true;
								player2Game = false;
								scoreLimit = scoreLimit + 20;
								if (computerPoints >= 100) {
									System.out.println("The computer has won! You've LOST...");
									System.out.printf("The Score: You: " + humanPoints + "\tComputer: " + computerPoints
											+ "\n\n");
									player2Game = false;
									player1Game = false;
									wholeGame = false;
									break;
								}
								middleComputerPoints = 0;
								break;
							}
							player1Game = false;
							player2Game = true;
							break;
						}
					}
				}
			}
		}
		assert (yesOrNo.equalsIgnoreCase("n")) || (yesOrNo.equalsIgnoreCase("y"));
		input.close();
	}
}
