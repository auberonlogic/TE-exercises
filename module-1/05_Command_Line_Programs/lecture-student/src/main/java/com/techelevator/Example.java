package com.techelevator;

import java.util.Scanner;

public class Example {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name >>> ");
        String name = keyboard.nextLine();

        // cannot use == when comparing objects. need to use .equals.
        if (name.equalsIgnoreCase("Tom")) {
            System.out.println("You are a jerk");
        } else {
            System.out.println("Welcome, " + name + "!");
        }

    }



}
