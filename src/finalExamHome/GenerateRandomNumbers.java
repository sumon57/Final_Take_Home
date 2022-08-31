package finalExamHome;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {

	public static void main(String[] args) {

		getSmallest();

	}

	public static int[] randomGenerator(int range, int upperBound) {
		Random rand = new Random();
		int[] generatedRandomNumbers = new int[range];

		for (int i = 0; i < range; i++) {
			generatedRandomNumbers[i] = rand.nextInt(upperBound);
			System.out.println(generatedRandomNumbers[i]);

		}
		return generatedRandomNumbers;

	}

	public static void getSmallest() {
		int[] randomArray = randomGenerator(500, 1000);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Nth number between 0 to 500 :");
		int N = userInput.nextInt();

		int temp = 0;
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = i + 1; j < randomArray.length; j++) {
				if (randomArray[i] > randomArray[j]) {
					temp = randomArray[i];
					randomArray[i] = randomArray[j];
					randomArray[j] = temp;

				}

			}

		}

		System.out.println("Nth smallest value : " + randomArray[N - 1]);
		userInput.close();

	}

}
