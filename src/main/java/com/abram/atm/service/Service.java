package com.abram.atm.service;

import com.abram.atm.Accounts;

public interface Service {
    void depositMoneyIntoAccount(Accounts account, double amount);
    void withdrawMoney( Accounts account, double amount);
}
