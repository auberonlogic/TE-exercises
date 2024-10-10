package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		double convertedTemp;

		System.out.print("Please enter the temperature: ");

		String temp = kb.nextLine();
		double tempDouble = Double.parseDouble(temp);

		System.out.print("Is the temperature in (C)elcius or (F)ahrenheit? ");

		String unit = kb.nextLine();

		if (unit.equalsIgnoreCase("F")) {
			convertedTemp = (tempDouble -32) / 1.8;
			System.out.println(temp + unit + " is " + (int)convertedTemp + "C.");
		} else if (unit.equalsIgnoreCase("C")) {
			convertedTemp = tempDouble = (tempDouble * 1.8) + 32;
			System.out.println(temp + unit + " is " + (int)convertedTemp + "F.");
		}
	}

}
