package com.abram.atm;

import com.abram.atm.service.impl.DebitService;

public class DebitAccount extends Accounts {
    public DebitAccount() {
    }

    public DebitAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.DEBIT, new DebitService());
    }
}

