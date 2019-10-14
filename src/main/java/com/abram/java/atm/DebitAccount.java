package com.abram.java.atm;

import com.abram.java.atm.service.impl.DebitService;

public class DebitAccount extends Accounts {
    public DebitAccount() {
    }

    public DebitAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.DEBIT, new DebitService());
    }
}

