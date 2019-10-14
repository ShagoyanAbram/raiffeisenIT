package com.abram.java.atm;

import com.abram.java.atm.service.impl.CurrentService;

public class CurrentAccount extends Accounts {
    public CurrentAccount() {
    }

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.CURRENT, new CurrentService());
    }
}
