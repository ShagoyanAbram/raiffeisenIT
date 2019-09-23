package com.abram.homework.three.atm;

import com.abram.homework.three.atm.service.impl.CurrentService;

public class CurrentAccount extends Accounts {
    public CurrentAccount() {
    }

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.CURRENT, new CurrentService());
    }
}
