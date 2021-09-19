package com.techelevator;

import java.util.Scanner;

public class TryingSomething {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Write a program that prints a given array in reverse order");

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
//        System.out.println();
//        System.out.println();
//
//
//        System.out.println("Write a program to print numbers from 1 to 10");
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//
//
//        System.out.println("Write a program to calculate the sum of first 10 natural number");
//
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//            System.out.print(i + " + ");
//        }
//        System.out.println("= " + sum);
//
//
//        System.out.println("Write a program that finds the summation of every number from 1 to num. " +
//                "\nThe number will always be a positive integer greater than 0.\n");
//
//        System.out.print("Please enter a positive integer: ");
//        String input = kb.nextLine();
//
//        int inputInt = Integer.parseInt(input);
//
//        int sum1 = 0;
//        for (int i = 1; i <= inputInt; i++) {
//            if (i < inputInt) {
//                System.out.print(i + " + ");
//                sum1 += i;
//            } else {
//                sum1 += i;
//                System.out.print(i + " = ");
//            }
//        }
//        System.out.print(sum1);
//
//
//        System.out.println("Write a program that prompts the user to input a positive integer. " +
//                "\nIt should then print the multiplication table of that number.");
//
//        System.out.print("Enter a positive integer: ");
//        String d = kb.nextLine();
//
//        int dInt = Integer.parseInt(d);
//
//        for (int m = 0; m <= dInt; m++) {
//            System.out.println(m + " * " + dInt + " = " + (dInt*m));
//        }
//
//
//        System.out.println("Write a program to find the factorial" +
//                "\nvalue of any number entered through the keyboard. ");
//
//        System.out.print("Enter a number: ");
//        String d = kb.nextLine();
//        int dInt = Integer.parseInt(d);
//
//        int product = 1;
//        for (int x = 1; x <= dInt; x++) {
//            if (x < dInt) {
//                System.out.print(x + " * ");
//                product *= x;
//            } else {
//                product *= x;
//                System.out.print(x + " = " + product);
//            }
//        }
//
//
//        System.out.println("Two numbers are entered through the keyboard. Write a program to find the" +
//                "\nvalue of one number raised to the power of another. (Do not use Java built-in method)");
//
//        System.out.print("Enter a positive number as a base: ");
//        int num1 = kb.nextInt();
//
//        System.out.print("Enter another positive number as an exponent: ");
//        int num2 = kb.nextInt();
//        int multiple = num2;
//
//        // I'm trying to make it multiply num1 a number of times equal to num2.
//        // Tired. Look into it in the morning.
//        for (int e = 1; e <= num2; e++) {
//            multiple *= num1; // the math is wrong
//        }
//        System.out.println(num1 + " raised to the " + num2 + " power = " + multiple);
//

        // Write a program to list primes <= to user input







    }
}
