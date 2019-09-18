package com.abram.atm;

public class DebitAccount implements Account {
    private int accountNumber;
    private double balance;
    private final String type = "Debit";
    private double stopOperation = -20000;

    public DebitAccount() {

    }

    public DebitAccount(int accountNumber, double balance, String type) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        //this.type = type;
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

    public String getType() {
        return type;
    }

    @Override
    public void depositMoneyIntoAccount(int accountNumber, double amount) {
        CreditAccount creditAccount = new CreditAccount();
        if (creditAccount.getBalance() >= stopOperation) {
            setBalance(balance + amount);
        } else {
            System.out.println("Наличие кредитного счета с балансом менее минус 20 000 запрещает работу с дебетовым счетом");
        }
    }

    @Override
    public void withdrawMoney(int accountNumber, double amount) {
        CreditAccount creditAccount = new CreditAccount();
        if (creditAccount.getBalance() >= stopOperation && amount < 30000 && balance >= amount ) {
                setBalance(balance - amount);
        } else {
            System.out.println("К сожалению ваш запрос не может быть выполнен");
        }
    }
}

