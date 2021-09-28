package com.techelevator;

public class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (getBalance() - amountToWithdraw < 150 && getBalance() > 0) {
            return super.withdraw(amountToWithdraw + 2);
        } else if (getBalance() - (amountToWithdraw + 2) < 0) {
            return getBalance();
        } else {
            return super.withdraw(amountToWithdraw);
        }
    }
}
