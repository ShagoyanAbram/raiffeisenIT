package com.abram.java.special_tools.annotation.atm;

import com.abram.java.special_tools.annotation.atm.service.impl.CreditService;

public class CreditAccount extends Accounts {
    public CreditAccount() {
    }

    public CreditAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.CREDIT, new CreditService());
    }
}
