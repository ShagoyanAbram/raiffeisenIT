package com.abram.homework.three.atm.service.impl;

import com.abram.homework.three.atm.AccountType;
import com.abram.homework.three.atm.Accounts;
import com.abram.homework.three.atm.CurrentAccount;
import com.abram.homework.three.atm.User;
import com.abram.homework.three.atm.service.Service;

public class CurrentService implements Service {
    private final double FIX_PRICE = 1000000;
    private final double BONUS = 2000;

    @Override
    public void depositMoneyIntoAccount(User user, Accounts accounts, double amount) {
        if (amount > FIX_PRICE) {
            for (Accounts account : user.getAccounts()) {
                if (account.getAccountType().equals(AccountType.DEBIT)) {
                    account.setBalance(account.getBalance() + BONUS);
                }
            }
        }
        accounts.setBalance(accounts.getBalance() + amount);
    }

    @Override
    public void withdrawMoney(Accounts accounts, double amount) {
        CurrentAccount currentAccount = (CurrentAccount) accounts;
        if (amount < 30000 && currentAccount.getBalance() >= amount) {
            currentAccount.setBalance(currentAccount.getBalance() - amount);
        } else {
            System.out.println("Сумма не должна превышать 30 000");
            System.out.println("Ваш баланс: " + currentAccount.getBalance());

        }
    }
}
