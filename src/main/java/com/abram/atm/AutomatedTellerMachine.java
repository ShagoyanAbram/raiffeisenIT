package com.abram.atm;

public class AutomatedTellerMachine {
    public static void depositMoneyIntoAccount(Account account, int amount) {
        account.setBalance(account.getBalance() + amount);
    }

    public static void withdrawMoney(Account account, int amount) {
        if (amount < 30000 && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("Сумма не должна превышать 30 000");
            System.out.println("Ваш баланс: " + account.getBalance());

        }
    }
}