package com.techelevator;

import java.util.Scanner;

public class Notes {


    public static void main(String[] args) {
        // we want user input so we can do more interesting things...
        Scanner keyboard = new Scanner(System.in);

//        String s = keyboard.nextLine();

//        System.out.println("You typed '" + s + "'");

        System.out.print("Enter a number to double: ");

        // if we want an int, we can use the next int method of Scanner
//        int i = keyboard.nextInt();

//        System.out.println("You typed '" + i + "'.");
//        System.out.println(i + " doubled is " + 2 * i);

        // We can also take in a string as input using nextLine and parse an int out of it.

        String numString = keyboard.nextLine();

        int num = Integer.parseInt(numString);

        System.out.println("You typed '" + num + "'.");
        System.out.println(num + " doubled is " + 2 * num);

        /*
        Integer.parseInt();
        Long.parseLong();
        Float.parseFloat();
        Double.parseDouble();
        Boolean.parseBoolean();
        Character.valueOf();
         */
    }

}
