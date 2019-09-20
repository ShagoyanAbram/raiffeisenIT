package com.abram.atm;

import com.abram.atm.service.Service;
import com.abram.atm.service.impl.CreditService;

public class CreditAccount extends Accounts implements Service {
    public CreditAccount() {
    }

    public CreditAccount(int accountNumber, double balance) {
        super(accountNumber, balance, AccountType.CREDIT, new CreditService());
    }
}
