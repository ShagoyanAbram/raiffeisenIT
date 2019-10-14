package com.abram.java.special_tools.annotation.atm.service.impl;

import com.abram.java.special_tools.annotation.atm.Accounts;
import com.abram.java.special_tools.annotation.atm.User;
import com.abram.java.special_tools.annotation.atm.annotation.MethodLimit;
import com.abram.java.special_tools.annotation.atm.service.Operation;
import com.abram.java.special_tools.annotation.atm.service.Service;

public class CreditService implements Service {

    private final Operation operation = new Operation();

    @Override
    @MethodLimit(methodLimit = 5)
    public void depositMoneyIntoAccount(User user, Accounts accounts, double amount) throws NoSuchFieldException, IllegalAccessException {
        accounts.setBalance(accounts.getBalance() + amount);
        operation.MethodLimit(accounts, this);
    }

    @Override
    @MethodLimit(methodLimit = 5)
    public void withdrawMoney(Accounts account, double amount) throws NoSuchFieldException, IllegalAccessException {
        if (amount < 30000 && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("Сумма не должна превышать 30 000");
            System.out.println("Ваш баланс: " + account.getBalance());
        }
        operation.MethodLimit(account, this);
    }
}
