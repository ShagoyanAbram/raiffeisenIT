package com.abram.java.special_tools.annotation.atm.service.impl;

import com.abram.java.special_tools.annotation.atm.Accounts;
import com.abram.java.special_tools.annotation.atm.User;
import com.abram.java.special_tools.annotation.atm.annotation.MethodLimit;
import com.abram.java.special_tools.annotation.atm.service.Operation;
import com.abram.java.special_tools.annotation.atm.service.Service;

public class DebitService implements Service {
    private double stopOperation = -20000;
    private final Operation operation = new Operation();

    @Override
    @MethodLimit(methodLimit = 5)
    public void depositMoneyIntoAccount(User user, Accounts account, double amount) throws NoSuchFieldException, IllegalAccessException {
        if (account.getBalance() >= stopOperation) {
            account.setBalance(account.getBalance() + amount);
        } else {
            System.out.println("Наличие кредитного счета с балансом менее минус 20 000 запрещает работу с дебетовым счетом");
        }
        operation.MethodLimit(account, this);
    }

    @Override
    @MethodLimit(methodLimit = 7)
    public void withdrawMoney(Accounts account, double amount) throws NoSuchFieldException, IllegalAccessException {
        if (account.getBalance() >= stopOperation && amount < 30000 && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("К сожалению ваш запрос не может быть выполнен");
        }
        operation.MethodLimit(account, this);
    }
}
