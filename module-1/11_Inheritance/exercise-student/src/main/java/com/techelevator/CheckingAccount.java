package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {

        // variable to store the new balance after withdrawal
        int newBalance = getBalance() - amountToWithdraw;

        // if newBalance will be less than -100, reject and return existing balance
        // else if less than 0, withdraw an additional 10 dollars and return new balance
        // else withdraw as usual and return new balance
        if (newBalance <= -100) {
            return getBalance();
        } else if (newBalance < 0) {
            return super.withdraw(amountToWithdraw + 10);
        }
        return super.withdraw(amountToWithdraw);
    }
}
