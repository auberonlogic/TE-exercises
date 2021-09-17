package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		// create Scanner
		Scanner kb = new Scanner(System.in);

		// prompt user for temp input
		System.out.print("Please enter the temperature: ");
		String tempString = kb.nextLine();

		// convert temp String input to int
		int tempInt = Integer.parseInt(tempString);

		// prompt user for temp unit
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String unit = kb.nextLine();

		// conversions
		if (unit.equalsIgnoreCase("C")) {
			// case when user enters C or c
			double fDouble = tempInt * 1.8 + 32;
			int fInt = (int)fDouble;
			System.out.println(tempInt + unit.toUpperCase() + " is " + fInt	+ "F.");

		} else if (unit.equalsIgnoreCase("F")) {
			// case when user enters F or f
			double cDouble = (tempInt - 32) / 1.8;
			int cInt = (int)cDouble;
			System.out.println(tempInt + unit.toUpperCase() + " is " + cInt	+ "C.");
		} else {
			// case when enters anything else
			System.out.println("Nice, real nice. Can you not follow instructions?");
		}

	}

}
