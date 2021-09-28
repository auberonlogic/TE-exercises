package com.techelevator;

public class CheckingAccount extends BankAccount {

    // Constructor
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (getBalance() - amountToWithdraw < -100) {
            return super.getBalance();
        } else if (getBalance() < 0.0 && getBalance() > -100.0) {
            return super.withdraw(amountToWithdraw + 10);
        } else {
            return super.withdraw(amountToWithdraw);
        }
    }

}
