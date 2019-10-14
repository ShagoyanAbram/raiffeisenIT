package com.abram.java.atm;

import com.abram.java.atm.service.impl.CreditService;

public class CreditAccount extends Accounts {
    public CreditAccount() {
    }

    public CreditAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.CREDIT, new CreditService());
    }
}
