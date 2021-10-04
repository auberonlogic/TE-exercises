package com.techelevator.exceptions;

import java.util.Scanner;

public class ExceptionsLecture {

<<<<<<< HEAD
	public static void cities(String[] args) {

		String[] cities = new String[]{"Pittsburgh", "Philadelphia", "Harrisburg"};
=======
	public static void main2(String[] args) {
		String[] cities = new String[] {"Pittsburgh", "Philadelphia", "Harrisburg"};
>>>>>>> a5375610800af274115ede691e43d3513d58721f

		try {
			System.out.println(cities[0] + " is a city in Pennsylvania");
			System.out.println(cities[1] + " is a city in Pennsylvania");
			System.out.println(cities[2] + " is a city in Pennsylvania");
<<<<<<< HEAD

			doSomethingStupid(); // will break. division by zero

			System.out.println(cities[3] + " is a city in Pennsylvania"); // will break. index out of bounds
			System.out.println("I forgot Johnstown and Erie!");
			System.out.println("Oh well, too bad for them.");
		} catch (Exception e) {
			System.out.println("Oh no! We had a problem");
			System.out.println("Printing out the stack trace anyway:");
			e.printStackTrace();
		}
		System.out.println("PROGRAM END");
=======
			doSomethingStupid();
			System.out.println(cities[3] + " is a city in Pennsylvania");
			System.out.println(" I forgot Johnstown and Erie!");
			System.out.println("Oh well, too bad for them");
		} catch (Exception e) {
			System.out.println("Oh no! We had a problem!");
			System.out.println("Printing out the stack trace anyway:");
			e.printStackTrace();
		}

		System.out.println("That's all, folks");
>>>>>>> a5375610800af274115ede691e43d3513d58721f
	}

	public static void doSomethingStupid() {
		try {
			System.out.println(100 / 0);
		} catch (Exception e) {
<<<<<<< HEAD
			System.out.println("Can't divide by zero!");
		}

	}

	public static void fahrenheitToFahrenheit(String[] args) {

=======
			System.out.println("Whoops!");
		}
	}

	public static void fahrenheitToFahrenheit() {
>>>>>>> a5375610800af274115ede691e43d3513d58721f
		Scanner scan = new Scanner(System.in);

		boolean weHaveValidInput = false;

<<<<<<< HEAD
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

=======
		while(!weHaveValidInput) {
			System.out.print("Enter the number of degrees Fahrenheit >>> ");
			String userTyped = scan.nextLine();

			try {
				int userTypedAsInteger = Integer.parseInt(userTyped);
				weHaveValidInput = true;
				System.out.println(userTypedAsInteger + " degrees F is equal to: " + userTypedAsInteger + " in F");
			} catch (Exception e) {
				System.out.println("Hey! Play nice!");
				System.out.println(e.getMessage() + " is not a number!");
			}
		}

		System.out.println("Done!");
>>>>>>> a5375610800af274115ede691e43d3513d58721f

	}

	public static double calculateHotelRoomCharge(int numberOfNights, int numberOfGuests) {
<<<<<<< HEAD

=======
>>>>>>> a5375610800af274115ede691e43d3513d58721f
		int extraGuestCharge = 25;
		int roomRate = 100;

		if (numberOfNights < 1) {
<<<<<<< HEAD
=======
			System.out.println("Don't do that!");
>>>>>>> a5375610800af274115ede691e43d3513d58721f
			throw new IllegalArgumentException("Non-positive number of nights!");
		}

		if (numberOfGuests < 1) {
<<<<<<< HEAD
			throw new IllegalArgumentException("Non-positive number of guests!");
		}


		return ((numberOfGuests - 1) * extraGuestCharge) * numberOfNights + (numberOfNights * roomRate);


=======
			System.out.println("Don't do that!");
			throw new IllegalArgumentException("Non-positive number of guests!");
		}

		return (numberOfGuests * extraGuestCharge) * numberOfNights + (numberOfNights * roomRate);
>>>>>>> a5375610800af274115ede691e43d3513d58721f
	}

	public static void main(String[] args) {
		Scanner darkly = new Scanner(System.in);
<<<<<<< HEAD
		System.out.print("How many people >>> ");
		int ppl = Integer.parseInt(darkly.nextLine());
		System.out.print("How many nights >>> ");
		int nights = Integer.parseInt(darkly.nextLine());


		double totalCharge = calculateHotelRoomCharge(nights,ppl);
		System.out.println(ppl + " guests for " + nights + " nights has a total charge of " +  totalCharge);
	}

=======
		System.out.print("How many people? >>> ");
		int ppl = Integer.parseInt(darkly.nextLine());
		System.out.print("How many nights? >>> ");
		int nights = Integer.parseInt(darkly.nextLine());

		double totalCharge = calculateHotelRoomCharge(nights, ppl);
		System.out.println(ppl + " Guests for " + nights + " nights has a total charge of: " + totalCharge);
	}


>>>>>>> a5375610800af274115ede691e43d3513d58721f
}

