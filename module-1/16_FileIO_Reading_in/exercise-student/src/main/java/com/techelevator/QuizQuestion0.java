package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestion0 {

    private String question;
    private List<String> answers; // = new ArrayList<>(); <--- eager instantiation
    private String correctAnswer;

    public QuizQuestion0(String line) {
        this.answers = new ArrayList<>();
        // What is the only temperature that is the same in Fahrenheit and Celsius?|20 degrees|100 degrees|-100 degrees|-40 degrees*
        String[] pieces = line.split("\\|");
        this.question = pieces[0];
        for (int i = 1; i < pieces.length; i++) {
            String answer = pieces[i];

            if (answer.endsWith("*")) { // -40 degrees*
                answer = answer.substring(0, answer.length() - 1); //-40 degrees
                this.correctAnswer = answer;
            }
            this.answers.add(answer);
        }
    }

    public boolean isCorrectAnswer(int guess) {
        return correctAnswer.equals(guess);
    }

    public String getQuestion() {
        return this.question;
    }

    public List<String> getAnswers() {
        return this.answers;
    }

}