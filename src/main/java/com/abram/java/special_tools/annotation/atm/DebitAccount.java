package com.abram.java.special_tools.annotation.atm;

import com.abram.java.special_tools.annotation.atm.service.impl.DebitService;

public class DebitAccount extends Accounts {
    public DebitAccount() {
    }

    public DebitAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.DEBIT, new DebitService());
    }
}

