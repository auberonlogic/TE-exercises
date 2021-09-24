package com.techelevator;

public class TestsAndExperiments {

    public static void main(String[] args) {

        int earnedMarks = 80;
        int possibleMarks = 100;

        double score = (double)earnedMarks / possibleMarks * 100;
        System.out.println("Score is : " + score + "%");


        double annualSalary = 100000.00;
        double percent = 5.5;

        double raiseSalary = annualSalary + annualSalary * percent/100;

        System.out.println("Annual salary: " + annualSalary);
        System.out.println("Expected raise: " + 105500);
        System.out.println("Raised salary: " + raiseSalary);


    }
}
