package com.abram.java.special_tools.annotation.atm;

import com.abram.java.special_tools.annotation.atm.service.impl.CurrentService;

public class CurrentAccount extends Accounts {
    public CurrentAccount() {
    }

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.CURRENT, new CurrentService());
    }
}
