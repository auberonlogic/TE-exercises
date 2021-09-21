package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		// this program prompts the user for a temperature and a unit of
		// measure, either C (Celsius) or F (Fahrenheit). Not case sensitive.
		// if user inputs C, the program converts temp to Fahrenheit and prints
		// the result.
		// if user inputs F, the program converts temp to Celsius and prints
		// the result.
		// if the user enters any other character for the unit of measure,
		// the program chews them out and quits.
		// if the user enters a temp that cannot be converted to an int,
		// the program will crash.

		// create Scanner
		Scanner kb = new Scanner(System.in);

		// prompt user for temp input
		System.out.print("Please enter the temperature: ");
		String tempString = kb.nextLine();

		// convert String input to int
		int tempInt = Integer.parseInt(tempString);

		// prompt user for unit of measure
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String unit = kb.nextLine();

		// conversions
		if (unit.equalsIgnoreCase("C")) {
			// case when user enters C or c
			double fDouble = tempInt * 1.8 + 32;
			int fInt = (int)fDouble;
			System.out.println(tempInt + "C" + " is " + fInt	+ "F.");

		} else if (unit.equalsIgnoreCase("F")) {
			// case when user enters F or f
			double cDouble = (tempInt - 32) / 1.8;
			int cInt = (int)cDouble;
			System.out.println(tempInt + unit.toUpperCase() + " is " + cInt	+ "C.");

		} else {
			// case when user enters anything else
			System.out.println("Nice, real nice. Can you not follow instructions?");
		}
	}
}
