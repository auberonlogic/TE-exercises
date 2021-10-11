package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser0 {

    public List<QuizQuestion0> parseQuizFile(String path) {
        File quizFile = new File(path);
        List<QuizQuestion0> questionList = new ArrayList<>();
        try {
            Scanner quizFileStreamer = new Scanner(quizFile);

            while (quizFileStreamer.hasNextLine()) {
                String line = quizFileStreamer.nextLine();
                QuizQuestion0 q = new QuizQuestion0(line);
                questionList.add(q);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find test_quiz.txt.");
        }
        return questionList;
    }
}
