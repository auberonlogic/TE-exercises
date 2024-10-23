package com.techelevator;

import java.util.Scanner;

public class Scratchpad {

    /**
     * This scratchpad is so I can play with the objects as I build the classes. I don't want to rely on passing or failing unit tests to determine the behavior. I want to see it myself.
     */

    public static void main(String[] args) {

        airplane();

    }

    static void airplane() {

        System.out.println("### AIRPLANE ###");

        Scanner scan = new Scanner(System.in);


    }

    static void employee() {

        System.out.println("### EMPLOYEE ###");

        Scanner scan = new Scanner(System.in);
        int count = 0;

        while (true) {

            count++;
            System.out.println();

            System.out.print("Enter salary: ");
            double salary = scan.nextDouble();

            Employee employee = new Employee(count, "john", "smith", salary);

            System.out.println("Employee: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getFullName());
            System.out.println("Starting salary: " + employee.getAnnualSalary());

            System.out.println();
            System.out.print("Enter a raise for " + employee.getFirstName() + ": ");
            double raise = scan.nextDouble();

            System.out.println();
            System.out.print(employee.getFirstName() + "'s salary of $" + employee.getAnnualSalary() + " has increased by " + raise + "% to $");

            employee.raiseSalary(raise);

            System.out.print(employee.getAnnualSalary());
        }
    }

    static void fruitTree() {

        Scanner scan = new Scanner(System.in);

        System.out.println("### FRUIT TREE ###");

            System.out.println();
            System.out.print("Enter type of fruit tree: ");
            String tree = scan.next();

            System.out.print("Enter how many pieces of fruit are on it: ");
            int startingFruit = scan.nextInt();

            FruitTree fruitTree = new FruitTree(tree, startingFruit);

            while (true) {

            System.out.println();
            System.out.print("Pick some fruit: ");
            int desiredFruit = scan.nextInt();

            System.out.println("You want " + desiredFruit + " pieces of fruit from the " + fruitTree.getTypeOfFruit() + " tree.");
            System.out.println("It has " + fruitTree.getPiecesOfFruitLeft() + " pieces left.");
            if (fruitTree.pickFruit(desiredFruit)) {
                System.out.println("That's enough to spare! There are now " + fruitTree.getPiecesOfFruitLeft() + " pieces of fruit left.");
            } else System.out.println("No fruit left!");
        }

    }


    static void homework() {

        System.out.println("### HOMEWORK ASSIGNMENT ###");

        Scanner scan = new Scanner(System.in);
        int count = 0;

        while(true) {

            count++;

            System.out.println();
            System.out.print("Enter possible marks: ");
            int possibleMarks = scan.nextInt();

            String submitterName = "student " + count;

            HomeworkAssignment homeworkAssignment = new HomeworkAssignment(possibleMarks, submitterName);

            System.out.print("Enter your score: ");
            int earnedMarks = scan.nextInt();

            homeworkAssignment.setEarnedMarks(earnedMarks);

            String letterGrade = homeworkAssignment.getLetterGrade();

            System.out.println(submitterName + " scored " + earnedMarks + " of " + possibleMarks + " points, with a score of " + (double) earnedMarks / possibleMarks * 100 + " earning a letter grade of " + letterGrade);
        }
    }
}
