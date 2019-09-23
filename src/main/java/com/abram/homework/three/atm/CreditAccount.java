package com.abram.homework.three.atm;

import com.abram.homework.three.atm.service.impl.CreditService;

public class CreditAccount extends Accounts {
    public CreditAccount() {
    }

    public CreditAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.CREDIT, new CreditService());
    }
}
