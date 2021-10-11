package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String outputFileString = keyboard.nextLine();

		File outputFile = new File(outputFileString);

		try (PrintWriter pw = new PrintWriter(outputFile)) {
			int num = 1;

			while (num >= 1 && num <= 300) {
				if (num % 3 == 0 && num % 5 == 0) {
					pw.println("FizzBuzz");
				} else if (num % 3 == 0 || Integer.toString(num).contains("3")) {
					pw.println("Fizz");
				} else if (num % 5 == 0 || Integer.toString(num).contains("5")) {
					pw.println("Buzz");
				} else {
					pw.println(num);
				}
				num++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Invalid Destination. Ending Program...");
			System.exit(1);
		}
	}
}
