package com.techelevator;

public class HomeworkAssignment {

    // instance variables
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    // constructor
    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    // Derived property. No String letterGrade instance
    public String getLetterGrade() {
        double score = (double)earnedMarks / possibleMarks * 100;
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        }else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Getters and Setters
    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }
}
