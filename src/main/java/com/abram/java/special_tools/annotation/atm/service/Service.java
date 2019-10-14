package com.abram.java.special_tools.annotation.atm.service;

import com.abram.java.special_tools.annotation.atm.Accounts;
import com.abram.java.special_tools.annotation.atm.User;

public interface Service {
    void depositMoneyIntoAccount(User user, Accounts account, double amount) throws NoSuchFieldException, IllegalAccessException;

    void withdrawMoney(Accounts account, double amount) throws NoSuchFieldException, IllegalAccessException;
}
