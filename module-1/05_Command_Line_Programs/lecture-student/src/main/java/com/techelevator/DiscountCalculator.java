package com.techelevator;

import java.util.Scanner;

public class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        // establish connection to keyboard
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");

        // 20% off!
        String discountString = scanner.nextLine();

        double discountDouble = Double.parseDouble(discountString);
//        System.out.println("Discount from $500: ");
//        System.out.println(Double.parseDouble(discountString) * 500);



        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");

       // 40 125 22 3 5000
       String prices = scanner.nextLine();

       String[] pricesArray = prices.split(" ");

       for (int i = 0; i < pricesArray.length; i++) {
           int priceAsInt = Integer.parseInt(pricesArray[i]);
           System.out.println("Original price: " + priceAsInt);
           System.out.println("Discounted price: " + (priceAsInt - (priceAsInt / 100 * discountDouble)));
       }








    }

}