package com.abram.homework.three.atm;

import com.abram.homework.three.atm.service.Service;

import java.util.Objects;

public class Accounts {
    protected int accountNumber;
    protected double balance;
    protected AccountType accountType;
    protected Service service;

    public Accounts() {
    }

    public Accounts(int accountNumber, double balance, AccountType accountType, Service service) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.service = service;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void depositMoneyIntoAccount(User user, double amount) {
        service.depositMoneyIntoAccount(user, this, amount);
    }

    public void withdrawMoney(Accounts account, double amount) {
        service.withdrawMoney(account, amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts = (Accounts) o;
        return accountNumber == accounts.accountNumber &&
                Double.compare(accounts.balance, balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
