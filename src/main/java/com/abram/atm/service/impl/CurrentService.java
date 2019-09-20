package com.abram.atm.service.impl;

import com.abram.atm.Accounts;
import com.abram.atm.CurrentAccount;
import com.abram.atm.DebitAccount;
import com.abram.atm.service.Service;

public class CurrentService implements Service {
    private final double fixPrice = 1000000;
    private final double bonus = 2000;

    @Override
    public void depositMoneyIntoAccount(Accounts accounts, double amount) {
        if (amount > fixPrice) {
            DebitAccount debitAccount = new DebitAccount();
            debitAccount.setBalance(debitAccount.getBalance() + bonus);
        }
        accounts.setBalance(accounts.getBalance() + amount);
    }

    @Override
    public void withdrawMoney(Accounts accounts, double amount) {
        CurrentAccount currentAccount = (CurrentAccount) accounts;
        if (amount < 30000 && currentAccount.getBalance() >= amount) {
            currentAccount.setBalance(currentAccount.getBalance() - amount);
        } else {
            System.out.println("Сумма не должна превышать 30 000");
            System.out.println("Ваш баланс: " + currentAccount.getBalance());

        }
    }
}
