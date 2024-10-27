package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {

        int newBalance = getBalance() -amountToWithdraw;

        if (newBalance < 0) {
            return super.withdraw(0);
        } else if (newBalance - 2 < 0) {
            return super.withdraw(0);
        } else if (newBalance < 150) {
            return super.withdraw(amountToWithdraw + 2);
        }
        return super.withdraw(amountToWithdraw);
    }
}
