package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.print("Please enter the length: ");

		String length = kb.nextLine();
		double lengthDouble = Double.parseDouble(length);

		System.out.print("Is the measurement in (m)eter, of (f)eet? ");

		String unit = kb.nextLine();

		double convertedLength;

		if (unit.equalsIgnoreCase("f")) {
			convertedLength = lengthDouble * 0.3048;
			System.out.println(length + unit + " is " + (int) convertedLength + "m");
		} else if (unit.equalsIgnoreCase("c")) {
			convertedLength = lengthDouble * 3.2808399;
			System.out.println(length + unit + " is " + (int) convertedLength + "f");
		}
	}

}
