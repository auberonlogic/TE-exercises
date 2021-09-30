package com.techelevator;

public class App {

    public static void main(String[] args) {

        System.out.println("Running!");

        CheckingAccount ca = new CheckingAccount("Ryan", "1234567890");

        ca.deposit(5000);
        System.out.println(ca.getBalance());

        System.out.println("End Program");
    }
}