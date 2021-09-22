package com.techelevator;

import java.util.Scanner;

public class FibonacciWithTom {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter a number >>> ");
        String userInput = kb.nextLine();

        int limit = Integer.parseInt(userInput);

        int lagA = 0;
        int lagB = 1;
        // A  B  c                      *shift these over by one element on each iteration*
        // 0  1  1  2  3  5  8  13  21  .........

        // for (init ; condition ; change) { code block }
        // while (condition) { code block }
        int current = lagA + lagB;
        while (current <= limit) {
            System.out.print(current + " ");
            lagA = lagB;
            lagB = current;
            current = lagA + lagB;
        }

/*        for (int current = lagA + lagB; current <= limit; current = lagA + lagB) {
            System.out.println(current);
            lagA = lagB;
            lagB = current;

        }*/

    }
}
