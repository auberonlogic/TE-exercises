package com.techelevator.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
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

	public static int calculateHotelRoomCharge(int numberOfNights, int numberOfGuests) throws HotelException {

		int extraGuestCharge = 25;
		int roomRate = 100;

		if (numberOfNights < 1) {
			System.out.println("Don't do that!");
<<<<<<< HEAD
=======
			//throw new IllegalArgumentException("Non-positive number of nights!");
>>>>>>> f827eb6d9bfb6116e11a9279ac1e1bbbedd3d2c0
			throw new HotelException();
		}

		if (numberOfGuests < 1) {
			System.out.println("Bruh... seriously, stop.");
			throw new HotelException();
		}

		return ((numberOfGuests - 1) * extraGuestCharge) * numberOfNights + (numberOfNights * roomRate);
	}

	public static void main(String[] args) {
<<<<<<< HEAD

		System.out.println("Let's book a hotel room!");

=======
		System.out.println("Let's book a hotel room!");
>>>>>>> f827eb6d9bfb6116e11a9279ac1e1bbbedd3d2c0
		Scanner darkly = new Scanner(System.in);

		System.out.print("How many people >>> ");
		int ppl = Integer.parseInt(darkly.nextLine());
		System.out.print("How many nights >>> ");
		int nights = Integer.parseInt(darkly.nextLine());


		int totalCharge = 0;
		try {
			totalCharge = calculateHotelRoomCharge(nights,ppl);
		} catch (HotelException e) {
			System.out.println("STOP MESSING WITH THE HOTEL PEOPLE!!!");
		}
		System.out.println(ppl + " guests for " + nights + " nights has a total charge of " +  totalCharge);

//		try {
//			int totalCharge = calculateHotelRoomCharge(nights,ppl);
//			System.out.println(ppl + " guests for " + nights + " nights has a total charge of " +  totalCharge);
//		} catch (Exception e) {
//			System.out.println("Caught an exception in Main that was generated elsewhere");
//		}

		File f = new File("doesn'texist.txt");

		if (!f.exists()) {
			System.out.println("Try again!");
		}

		Scanner k = new Scanner(System.in);

		try {
			Scanner s = new Scanner(f);
		} catch	(FileNotFoundException e) {
			System.out.println("Caught a file not found exception!");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String out of bounds exception");
		} catch (Exception e) {
			System.out.println("General exception");
		}

	}
}