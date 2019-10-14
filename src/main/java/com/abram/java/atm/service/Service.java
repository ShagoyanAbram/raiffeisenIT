package com.abram.java.atm.service;

import com.abram.java.atm.Accounts;
import com.abram.java.atm.User;

public interface Service {
    void depositMoneyIntoAccount(User user, Accounts account, double amount);
    void withdrawMoney( Accounts account, double amount);
}
