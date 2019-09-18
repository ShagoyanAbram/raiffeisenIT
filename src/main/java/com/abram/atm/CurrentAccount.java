package com.abram.atm;

public class CurrentAccount implements Account {
    private int accountNumber;
    private double balance;
    private final String type = "Current";
    private double fixPrice = 1000000;
    private double bonus = 2000;

    public CurrentAccount(int accountNumber, double balance, String type) {
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
        if (amount > fixPrice) {
            DebitAccount debitAccount = new DebitAccount();
            debitAccount.setBalance(debitAccount.getBalance() + bonus);
        }
        setBalance(balance + amount);
    }

    @Override
    public void withdrawMoney(int accountNumber, double amount) {
        if (amount < 30000 && balance >= amount) {
            setBalance(balance - amount);
        } else {
            System.out.println("Сумма не должна превышать 30 000");
            System.out.println("Ваш баланс: " + balance);

        }
    }
}
