package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean validPath = false;
		String quizFilePath = "";

		while(!validPath) {
			System.out.println("Enter the fully qualified name of the file to read in for quiz questions");
			quizFilePath = scan.nextLine();
			try {
				File testQuiz = new File(quizFilePath);
				Scanner file = new Scanner(testQuiz);
				validPath = true;
				int score = 0;
				try {
					while(file.hasNextLine()) {

						// Set up quiz, prompt user for choice
						// store line of test_quiz.txt as a String
						String stringData = file.nextLine();

						// Split the answer and questions
						String[] split = stringData.split("\\|");

						System.out.println("\n" + split[0]);
						String finalAnswer = "";
						int correctAnswer = 0;

						for (int i = 1; i < split.length; i++) {
							System.out.print(i + ". ");
							if (split[i].contains("*")) {
								correctAnswer = i;
								finalAnswer = split[i].substring(0, split[i].length() - 1);
								System.out.println(finalAnswer);
							} else {
								System.out.println(split[i]);
							}
						}

						boolean isValid = false;

						while(!isValid) {
							System.out.print("\nYour answer: ");
							int userInput = scan.nextInt();
							if (userInput > 0 && userInput < 5) {
								isValid = true;
								if (userInput == correctAnswer) {
									System.out.println("RIGHT!");
									score++;
								} else {
									System.out.println("WRONG!");
								}
							}
						}
					}
				} catch (Exception e){
					System.out.println("No such file.");
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				System.out.println("You got " + score + " correct!");
			} catch (Exception e) {
				System.out.println("Please enter test_quiz.txt");
			}
		}
	}
}




