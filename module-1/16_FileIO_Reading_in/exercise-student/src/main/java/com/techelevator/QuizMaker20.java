package com.techelevator;

import java.util.List;

public class QuizMaker20 {

    public static void main(String[] args) {
        UserInteraction0 ui = new UserInteraction0();
        FileParser0 fileParser = new FileParser0();
        List<QuizQuestion0> questionList = fileParser.parseQuizFile("test_quiz.txt");

            int correctAnswers = 0;
            for (QuizQuestion0 q : questionList) {
                ui.askQuizQuestion(q);
                int guess = ui.promptUserForGuess();
                if (q.isCorrectAnswer(guess)) {
                    ui.correct();
                    correctAnswers++;
                } else {
                    ui.incorrect();
                }
            }

            ui.summary(correctAnswers, questionList.size());

    }






}
