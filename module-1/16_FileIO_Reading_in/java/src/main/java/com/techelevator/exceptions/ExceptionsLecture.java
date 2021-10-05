package com.techelevator.exceptions;

import java.util.Scanner;

public class ExceptionsLecture {

	public static void cities(String[] args) {

		String[] cities = new String[]{"Pittsburgh", "Philadelphia", "Harrisburg"};

		try {
			System.out.println(cities[0] + " is a city in Pennsylvania");
			System.out.println(cities[1] + " is a city in Pennsylvania");
			System.out.println(cities[2] + " is a city in Pennsylvania");

			doSomethingStupid(); // will break. division by zero

			System.out.println(cities[3] + " is a city in Pennsylvania"); // will break. index out of bounds
			System.out.println("I forgot Johnstown and Erie!");
			System.out.println("Oh well, too bad for them.");
		} catch (Exception e) {
			System.out.println("Oh no! We had a problem");
			System.out.println("Printing out the stack trace anyway:");
			e.printStackTrace();
		}
		System.out.println("That's all, folks");
	}

	public static void doSomethingStupid() {
		try {
			System.out.println(100 / 0);
		} catch (Exception e) {
			System.out.println("Can't divide by zero!");
		}

	}

	public static void fahrenheitToFahrenheit() {

		Scanner scan = new Scanner(System.in);

		boolean weHaveValidInput = false;

		while (!weHaveValidInput) {
			System.out.print("Enter the number of degrees Fahrenheit >>> ");
			String userInput = scan.nextLine();

			try {
				// DANGEROUS CODE OOOOOOOOOO!
				int userInputAsInteger = Integer.parseInt(userInput); // if this doesn't work, the rest of the try block is skipped
				weHaveValidInput = true;
				int answerInCelsius = userInputAsInteger;
				System.out.println(answerInCelsius + " degrees F is equal to " + answerInCelsius + " F.");
			} catch (Exception e) { // Exception e references and names the exception
				System.out.println("Hey! Play nice!");
				System.out.println("\"" + e.getMessage() + " is not a number!");
			}
		}
		System.out.println("PROGRAM END");
	}

	public static double calculateHotelRoomCharge(int numberOfNights, int numberOfGuests) {

		int extraGuestCharge = 25;
		int roomRate = 100;

		if (numberOfNights < 1) {
			System.out.println("Don't do that!");
			throw new IllegalArgumentException("Non-positive number of nights!");
		}

		if (numberOfGuests < 1) {
			throw new IllegalArgumentException("Non-positive number of guests!");
		}

		return ((numberOfGuests - 1) * extraGuestCharge) * numberOfNights + (numberOfNights * roomRate);
	}

	public static void main(String[] args) {
		Scanner darkly = new Scanner(System.in);

		System.out.print("How many people >>> ");
		int ppl = Integer.parseInt(darkly.nextLine());
		System.out.print("How many nights >>> ");
		int nights = Integer.parseInt(darkly.nextLine());


		double totalCharge = calculateHotelRoomCharge(nights,ppl);
		System.out.println(ppl + " guests for " + nights + " nights has a total charge of " +  totalCharge);
	}
}