
/**
 *	Program: Tambola Game
 *	Date of Creation: 20-Jun-2020
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

public class Final_Tambola {

	private static Scanner inputKey;
	private static Random random;

	public static void main(String[] args) {

		int num[][] = new int[10][10];
		inputKey = new Scanner(System.in);
		random = new Random();
		int round = 1;
		String enterKey;
		do {
			enterKey = null;
			int number = random.nextInt(100) + 1;
			int dividend = number / 10;
			int remainder = number % 10;
			if (remainder == 0) {
				remainder = 10;
				dividend--;
			}

			if (num[dividend][remainder - 1] == number) {
				enterKey = "";
				continue;
			} else {
				num[dividend][remainder - 1] = number;
				round++;
			}
			System.out.print("Number is " + number + "\n\n");

			for (int i[] : num) {
				for (int j : i) {
					System.out.print(j);
					System.out.print("\t");
				}
				System.out.println("\n");
			}

			if (round == 101) {
				System.out.println("Thanks For Playing");
				break;
			}

			System.out.println("Press Enter to Continue \n");
			enterKey = inputKey.nextLine();

		} while (enterKey != null);

	}
}
