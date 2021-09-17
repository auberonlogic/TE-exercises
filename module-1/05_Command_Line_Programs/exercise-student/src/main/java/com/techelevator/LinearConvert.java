package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		// this program prompts the user for a length and a unit of
		// measure, either m (meters) or f (feet). Not case sensitive.
		// if user inputs m, the program converts length to feet and prints
		// the result.
		// if user inputs f, the program converts length to meters and prints
		// the result.
		// if the user enters any other character for the unit of measure,
		// the program chews them out and quits.
		// if the user enters a length that cannot be converted to an int,
		// the program will crash.

		// create Scanner
		Scanner kb = new Scanner(System.in);

		// prompt user for length
		System.out.print("Please enter the length: ");
		String lengthString = kb.nextLine();

		// convert input String to int
		int lengthInt = Integer.parseInt(lengthString);

		// prompt user for unit of measure
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String unitString = kb.nextLine();

		// conversions
		if (unitString.equalsIgnoreCase("m")) {
			// case user entered m
			double feetDouble = lengthInt * 3.2808399;
			int feetInt = (int)feetDouble;
			System.out.println(lengthInt + unitString.toLowerCase() + " is " + feetInt + "f.");

		} else if (unitString.equalsIgnoreCase("f")) {
			// case user entered f
			double metersDouble = lengthInt * 0.3048;
			int metersInt = (int)metersDouble;
			System.out.println(lengthInt + unitString.toLowerCase() + " is " + metersInt + "m.");

		} else {
			// case user entered anything else
			System.out.println("Bruh.........");
			System.out.println("I asked for an 'm' or an 'f'...");
			System.out.println("I'd even take an 'M' or an 'F'...");
			System.out.println("But no, you couldn't do that.");
		}
	}
}
