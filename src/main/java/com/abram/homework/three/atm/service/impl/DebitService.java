package com.abram.homework.three.atm.service.impl;

import com.abram.homework.three.atm.Accounts;
import com.abram.homework.three.atm.User;
import com.abram.homework.three.atm.service.Service;

public class DebitService implements Service {
    private double stopOperation = -20000;

    @Override
    public void depositMoneyIntoAccount(User user, Accounts account, double amount) {
        if (account.getBalance() >= stopOperation) {
            account.setBalance(account.getBalance() + amount);
        } else {
            System.out.println("Наличие кредитного счета с балансом менее минус 20 000 запрещает работу с дебетовым счетом");
        }
    }

    @Override
    public void withdrawMoney(Accounts account, double amount) {
        if (account.getBalance() >= stopOperation && amount < 30000 && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("К сожалению ваш запрос не может быть выполнен");
        }
    }
}
