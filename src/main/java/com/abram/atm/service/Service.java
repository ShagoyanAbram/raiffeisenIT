package com.abram.atm.service;

import com.abram.atm.Accounts;
import com.abram.atm.User;

public interface Service {
    void depositMoneyIntoAccount(User user, Accounts account, double amount);
    void withdrawMoney( Accounts account, double amount);
}
