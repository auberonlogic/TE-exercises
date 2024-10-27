package com.techelevator.challenge;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, BigDecimal balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public BigDecimal withdraw(BigDecimal amountToWithdraw) {
        BigDecimal newBalance = getBalance().subtract(amountToWithdraw);

        if (newBalance.intValue() < 0) {
            return super.withdraw(BigDecimal.valueOf(0));
        } else if (newBalance.intValue() - 2 < 0) {
            return super.withdraw(BigDecimal.valueOf(0));
        } else if (newBalance.longValue() < 150) {
            return super.withdraw(amountToWithdraw.add(BigDecimal.valueOf(2)));
        }
        return super.withdraw(amountToWithdraw);
    }

}