package com.techelevator;

import java.util.Scanner;

public class FibonacciAlone {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int num = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + ", " + b);

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i == a + b) {
                    System.out.print(", " + i);
                    a = b;
                    b = i;
                }
            }
        }

    }

}
