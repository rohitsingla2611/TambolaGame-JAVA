
/**
 *	Program: Tambola Game
 *	Date of Creation: 17-Nov-2017
 *	Author: ROHIT SINGLA
 *	Input:
 *	Output:
 */

/**
 * @author ROHIT SINGLA
 *
 */

import java.util.Random;
import java.util.Scanner;

public class Tambola {

	private static Scanner inputKey;
	private static Random random;

	public static void main(String[] args) {

		int tensDigitIndex, onesDigitIndex, number;
		int tambolaNumbers[][] = new int[10][10];
		inputKey = new Scanner(System.in);
		random = new Random();
		int round = 1;
		String enterKey;

		do {
			enterKey = null;
			number = random.nextInt(100) + 1;
			tensDigitIndex = number / 10;
			onesDigitIndex = number % 10;
			if (onesDigitIndex == 0) {
				tensDigitIndex--;
				onesDigitIndex = 10;
			}

			if (tambolaNumbers[tensDigitIndex][onesDigitIndex - 1] == number) {
				enterKey = "";
				continue;
			} else
				tambolaNumbers[tensDigitIndex][onesDigitIndex - 1] = number;

			System.out.print("The Number is " + number + "\n\n");

			for (int i[] : tambolaNumbers) {
				for (int j : i) {
					System.out.print(j);
					System.out.print("\t");
				}
				System.out.println("\n");
			}

			if (round == 100) {
				System.out.println("Thanks For Playing");
				break;
			}
			round++;

			System.out.println("Press Enter to Continue \n");
			enterKey = inputKey.nextLine();

		} while (enterKey != null);

	}
}
