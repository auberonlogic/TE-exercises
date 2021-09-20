package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */

    // public: access modifier
    // static:
    // void: return type (lack of output in this case)
    // main: method name
    // String[] args: parameter is string array called args
    public static void main(String[] args) {

        // Establish connection to the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt user:
        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");

        // 20% off!
        String discountString = keyboard.nextLine();
        double discountDouble = Double.parseDouble(discountString);

//        Integer.parseInt();
//        Long.parseLong();
//        Float.parseFloat();
//        Double.parseDouble();
//        Boolean.parseBoolean();
//        Character.valueOf();

//        System.out.println("Discount from $500: ");
//        System.out.println(500 * (discountDouble / 100));





        // Prompt the user for a series of prices
        // "40 125 22 3 5000"
        System.out.print("Please provide a series of prices (space separated): ");
        String seriesOfPrices = keyboard.nextLine();

        // split takes a string and separates it into multiple strings
        // It knows where to split elements based on the input (" ")
        // Then assigned to string array prices
        String[] prices = seriesOfPrices.split(" ");

        for (int i = 0; i < prices.length; i++) {
            String thisPriceAsString = prices[i];
            int thisPriceAsInt = Integer.parseInt(thisPriceAsString);

            System.out.println("This price: " + thisPriceAsInt + " after discount is: ");
            System.out.println((thisPriceAsInt - ((discountDouble/thisPriceAsInt) * 100)) + " dollars");
        }

        System.out.println("Done");







    }

}