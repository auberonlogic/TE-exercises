package com.techelevator;

import java.util.List;
import java.util.Scanner;

public class UserInteraction0 {

    private static Scanner keyboard;

    public UserInteraction0() {
        keyboard = new Scanner(System.in);
    }

    public void askQuizQuestion(QuizQuestion0 q) {
        System.out.println(q.getQuestion());
        List<String> answers = q.getAnswers();

        int counter = 1;
        for (String answer : answers) {
            System.out.println(counter + ". " + answer);
            counter++;
        }
    }

    public int promptUserForGuess() {
        boolean haveValidInput = false;
        int number = 0;
        while(!haveValidInput)
        System.out.println("What is your guesss?");
        String guess = keyboard.nextLine();
        try {
            number = Integer.parseInt(guess);
            haveValidInput = true;
        } catch (Exception e){
            System.out.println(e.getMessage() + " is not a valid number. Try again.");
        }
        return number;
    }

    public String promptUserForFilePath() {
        System.out.println("What is your guess");
        String path = keyboard.nextLine();
        return path;
    }

    public void correct() {
        System.out.println("You got that RIGHT!");
    }

    public void incorrect() {
        System.out.println("You got that WRONG!");
    }

    public void summary(int correctAnswers, int size) {

    }



}
