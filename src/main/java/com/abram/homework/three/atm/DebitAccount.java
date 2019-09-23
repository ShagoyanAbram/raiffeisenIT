package com.abram.homework.three.atm;

import com.abram.homework.three.atm.service.impl.DebitService;

public class DebitAccount extends Accounts {
    public DebitAccount() {
    }

    public DebitAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.DEBIT, new DebitService());
    }
}

