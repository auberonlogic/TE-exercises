package com.techelevator;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch0 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is the fully qualified name of the file that should be searched?");
		String aliceFilePath = scan.nextLine();

		System.out.println("What is the search word you are looking for?");
		String searchWord = scan.nextLine();

		System.out.println("Should the search be case sensitive? (Y\\\\N)");
		String caseResponse = scan.nextLine();

		File aliceFile = new File(aliceFilePath);

		if (caseResponse.equalsIgnoreCase("N")) {
			try {
				Scanner fileInput = new Scanner(aliceFile);
				int lineNumber = 0;
				while(fileInput.hasNextLine()) {
					lineNumber++;
					String currentLine = fileInput.nextLine();
					if (currentLine.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(lineNumber + ") " + currentLine);
					}
				}
			} catch (Exception e) {
				System.out.println("Couldn't open " + aliceFile.getName() +
						". Please check your spelling.");
			}
		} else {
			try {
				Scanner fileInput = new Scanner(aliceFile);
				int lineNumber = 0;
				while(fileInput.hasNextLine()) {
					lineNumber++;
					String currentLine = fileInput.nextLine();
					if (currentLine.contains(searchWord)) {
						System.out.println(lineNumber + ") " + currentLine);
					}
				}
			} catch (Exception e) {
				System.out.println("Couldn't open " + aliceFile.getName() +
						". Please check your spelling.");
			}
		}
	}
}
