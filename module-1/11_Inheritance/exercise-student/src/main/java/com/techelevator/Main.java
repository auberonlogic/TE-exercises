package com.techelevator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("### CHECKING ACCOUNT ###");

        Scanner scan = new Scanner(System.in);

        CheckingAccount checking = new CheckingAccount("", "");

        int balance = 0;

        while (true) {
            System.out.println();
            System.out.print("Enter starting balance: ");
            balance = scan.nextInt();
//            checking.setBalance(balance);

            System.out.println("Current balance: " + checking.getBalance());

            System.out.println();
            System.out.print("Enter amount to withdraw: ");
            int withdraw = scan.nextInt();

            System.out.println("New balance: " + checking.withdraw(withdraw));
        }
    }

}
