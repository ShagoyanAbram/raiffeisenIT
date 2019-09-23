package com.abram.homework.three.atm.service;

import com.abram.homework.three.atm.Accounts;
import com.abram.homework.three.atm.User;

public interface Service {
    void depositMoneyIntoAccount(User user, Accounts account, double amount);
    void withdrawMoney(Accounts account, double amount);
}
