package com.abram.java.special_tools.annotation.atm;

import java.util.List;

public class User {
    private List<Accounts> accounts;

    public User() {
    }

    public User(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
}
