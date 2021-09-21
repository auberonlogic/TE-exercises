package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer >>> ");
		String userInput = keyboard.nextLine();

		long limit = Long.parseLong(userInput);

		if (limit < 1) {
			System.out.println("0, 1");
			System.exit(0);
		} else if (limit == 1) {
			System.out.println("0, 1, 1");
			System.exit(0);
		}

		long lagA = 0;
		long lagB = 1;
		// 							A	B
		// 0	1	1	2	3	5	8	13

		// for (init ; condition; change) { code block }
		// while (condition) { code block }
		long current = lagA + lagB;

		while(current <= limit) {
			System.out.print(current);
			System.out.print(", ");
			lagA = lagB;
			lagB = current;
			current = lagA + lagB;
		}

		System.out.println("Done!");


	}

}
