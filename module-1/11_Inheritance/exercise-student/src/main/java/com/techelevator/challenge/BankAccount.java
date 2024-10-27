package com.techelevator.challenge;

import java.math.BigDecimal;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.valueOf(0);
    }

    public BankAccount(String accountHolderName, String accountNumber, BigDecimal balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal deposit(BigDecimal amountToDeposit) {
        return this.balance.add(amountToDeposit);
    }

    public BigDecimal withdraw(BigDecimal amountToWithdraw) {
        return this.balance.subtract(amountToWithdraw);
    }
}
