package com.abram.java.special_tools.annotation.atm;

import com.abram.java.special_tools.annotation.atm.annotation.Loggable;
import com.abram.java.special_tools.annotation.atm.annotation.OperationLimit;
import com.abram.java.special_tools.annotation.atm.service.Operation;
import com.abram.java.special_tools.annotation.atm.service.Service;

import java.util.Objects;
import java.util.logging.Logger;

@Loggable(loggable = true)
@OperationLimit(operationLimit = 2)
public class Accounts {
    protected int accountNumber;
    protected double balance;
    protected AccountType accountType;
    public static int operationCount = 0;
    protected int methodCount = 0;
    protected Service service;
    private Operation operation = new Operation();
    public Logger log = Logger.getLogger(Accounts.class.getName());

    public Accounts() {
    }

    public Accounts(int accountNumber, double balance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
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
        if (operation.checkLoggable()) {
            log.info("");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        if (operation.checkLoggable()) {
            log.info("log ");
        }
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void depositMoneyIntoAccount(User user, double amount) throws NoSuchFieldException, IllegalAccessException {
        if (operation.OperationLimit()) {
            service.depositMoneyIntoAccount(user, this, amount);
            if (operation.checkLoggable()) {
                log.info("log depositMoneyIntoAccount");
            }
        } else {
            System.out.println("operation limit: " + operationCount);
        }
    }

    public int getOperationCount() {
        return operationCount;
    }

    public int getMethodCount() {
        return methodCount;
    }

    public void setOperationCount(int operationCount) {
        this.operationCount = operationCount;
        if (operation.checkLoggable()) {
            log.info("log ");
        }
    }

    public void setMethodCount(int methodCount) {
        this.methodCount = methodCount;
    }

    public void withdrawMoney(Accounts account, double amount) throws NoSuchFieldException, IllegalAccessException {
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
