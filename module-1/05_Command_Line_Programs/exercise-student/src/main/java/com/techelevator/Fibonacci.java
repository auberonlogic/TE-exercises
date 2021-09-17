package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// create scanner and prompt user for input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String inputString = keyboard.nextLine();

		// convert user input String to int
		int inputInt = Integer.parseInt(inputString);

		// create array of length whatever the user entered
		int[] arr = new int[inputInt];

		// Fibonacci loop
		int fibOne = 0;
		int fibTwo = 1;

		System.out.print(fibOne + " ");
		System.out.print(fibTwo + " "); // this messes up if user chooses 0

		for (int i = 1; i <= inputInt; i++) {
			if (i == fibOne + fibTwo && fibTwo > fibOne) {
				System.out.print(i + " ");
				fibOne = i;
			} else if (i == fibOne + fibTwo && fibOne >= fibTwo) {
				System.out.print(i + " ");
				fibTwo = i;
			}
		}
	}
}
