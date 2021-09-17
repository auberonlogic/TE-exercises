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

//		for (int i = 0; i <= arr.length; i++) {
//			System.out.println(i);
//			if (i == 1) {
//				System.out.println(validFib + " " + i);
//				validFib += i;
//
//			} else if (i >=1 && i == validFib + arr[i - 1]) {
//				System.out.println(i);
//				System.out.println(i);
//			}
//
//		}



	}

}
