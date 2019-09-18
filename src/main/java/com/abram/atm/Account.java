package com.abram.atm;

public interface Account {
    void depositMoneyIntoAccount(int accountNumber, double amount);

    void withdrawMoney(int accountsNumber, double amount);
}
