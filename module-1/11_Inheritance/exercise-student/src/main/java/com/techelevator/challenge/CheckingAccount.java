package com.techelevator.challenge;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, BigDecimal balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public BigDecimal withdraw(BigDecimal amountToWithdraw) {
        BigDecimal newBalance = getBalance().subtract(amountToWithdraw);

        if (newBalance.intValue() <= -100) {
            return getBalance();
        } else if (newBalance.intValue() < 0) {
            return super.withdraw(amountToWithdraw.add(BigDecimal.valueOf(10)));
        }
        return super.withdraw(amountToWithdraw);
    }
}
