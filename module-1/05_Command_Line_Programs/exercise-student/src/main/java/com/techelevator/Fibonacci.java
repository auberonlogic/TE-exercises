package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// This program prompts the user for a number, then prints the fibonacci
		// sequence up to and including that number (provided its a fibonacci number).
		//
		// If the user chooses 18, output will read "0 1 1 2 3 5 8 13"

		// create scanner and prompt user for input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String inputString = keyboard.nextLine();

		// convert user input from String to int
		int inputInt = Integer.parseInt(inputString);

		// case when user inputs n = 0
		if (inputInt == 0) {
			System.out.print(inputInt);
		} else {
			// case when user inputs n > 0

			// fibOne and fibTwo store the values that need to be summed to generate the next fibonacci number
			int fibOne = 0;
			int fibTwo = 1;

			// This loop iterates from 0 to whichever number the user inputted.
			// It first checks if the index is equivalent to fibOne (which is equal to zero when the loop starts).
			// Because i = 0, the first if statement will print out the first 2 fibonacci numbers.
			// i will then increment to 1. The first if condition will return false and be skipped.
			// i is checked against the sum of fibOne and fibTwo (currently 1) and be equal. If fibTwo is larger
			// than fibOne, i will be printed and then assigned to fibOne.
			// 
			for (int i = 0; i <= inputInt; i++) {
				if (i == fibOne) {
					System.out.print(fibOne + " " + fibTwo + " ");
				} else if (i == fibOne + fibTwo && fibTwo >= fibOne) {
					System.out.print(i + " ");
					fibOne = i;
				} else if (i == fibOne + fibTwo && fibOne >= fibTwo) {
					System.out.print(i + " ");
					fibTwo = i;
				}
			}
		}

//		int fibOne = 0;
//		int fibTwo = 1;
//
//		System.out.print(fibOne + " ");
//		System.out.print(fibTwo + " "); // this messes up if user chooses 0
//
//		for (int i = 1; i <= inputInt; i++) {
//			if (i == fibOne + fibTwo && fibTwo > fibOne) {
//				System.out.print(i + " ");
//				fibOne = i;
//			} else if (i == fibOne + fibTwo && fibOne >= fibTwo) {
//				System.out.print(i + " ");
//				fibTwo = i;
//			}
//		}
	}
}
