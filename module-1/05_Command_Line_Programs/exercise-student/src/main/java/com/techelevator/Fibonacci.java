package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// This program prompts the user for a number, then prints the fibonacci
		// sequence up to and possibly including that number.
		//
		// If the user chooses 18, output will read "0 1 1 2 3 5 8 13"

		// create scanner and prompt user for input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String inputString = keyboard.nextLine();
		// if user enters value too near the max size of an int (2147483647),
		// the addition before that will cause the program to loop endlessly
		// between negative and positive outputs (2038 problem)

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
			// The first iteration will print out the first two Fibonacci numbers.
			// Each iteration after the first will check i against the sum of fibOne and fibTwo.
			// If i and the sum of fibOne and fibTwo are equivalent, the program will check which
			// of the stored Fibonacci values is greater and assign i to the variable holding the
			// smaller value. If fibOne and fibTwo are equal, it doesn't matter which variable the new
			// value is assigned to, so it's assigned to fibOne.
			// This will repeat as long as i does not exceed the user input.
			for (int i = 0; i <= inputInt; i++) {
				if (i == fibOne) {
					System.out.print(fibOne + " " + fibTwo + " ");
				} else if (i == fibOne + fibTwo) {
					System.out.print(i + " ");
					if (fibTwo >= fibOne) {
						fibOne = i;
					} else {
						fibTwo = i;
					}
				}
			}
		}
	}
}

