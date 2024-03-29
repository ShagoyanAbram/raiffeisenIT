package com.abram.java.atm.service.impl;

import com.abram.java.atm.Accounts;
import com.abram.java.atm.User;
import com.abram.java.atm.service.Service;

public class CreditService implements Service {
    @Override
    public void depositMoneyIntoAccount(User user, Accounts accounts, double amount) {
        accounts.setBalance(accounts.getBalance() + amount);
    }

    @Override
    public void withdrawMoney(Accounts account, double amount) {
        if (amount < 30000 && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("Сумма не должна превышать 30 000");
            System.out.println("Ваш баланс: " + account.getBalance());
        }
    }
}
