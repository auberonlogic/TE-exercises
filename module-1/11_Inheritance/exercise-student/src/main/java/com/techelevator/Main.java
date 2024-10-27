package com.techelevator;

import com.techelevator.challenge.CheckingAccount;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("### CHECKING ACCOUNT ###");

        Scanner scan = new Scanner(System.in);

        CheckingAccount checking = new CheckingAccount("", "");
        BigDecimal balance = BigDecimal.valueOf(0);

        while (true) {
            System.out.println();
            System.out.print("Enter starting balance: ");
            balance = BigDecimal.valueOf(scan.nextInt());
            checking.setBalance(balance);

            System.out.println("Current balance: " + checking.getBalance());

            System.out.println();
            System.out.print("Enter amount to withdraw: ");
            BigDecimal withdraw = BigDecimal.valueOf(scan.nextInt());

            System.out.println("New balance: " + checking.withdraw(withdraw));
        }
    }

}
