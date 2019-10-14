package com.abram.java.special_tools.annotation.atm;

public enum AccountType {
    CREDIT("Credit"),
    CURRENT("Current"),
    DEBIT("Debit");

    private String type;

    private AccountType(String type) {
        this.type = type;
    }
}
