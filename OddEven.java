package firstproject;

import java.util.Scanner;

public class OddEven {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter an integer to check if it is odd or even.");
		final int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " is a even number.");
		} else
			System.out.println(number + " is a odd number.");
		scanner.close();
	}
}