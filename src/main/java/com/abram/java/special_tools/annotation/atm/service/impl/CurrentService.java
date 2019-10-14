package com.abram.java.special_tools.annotation.atm.service.impl;

import com.abram.java.special_tools.annotation.atm.AccountType;
import com.abram.java.special_tools.annotation.atm.Accounts;
import com.abram.java.special_tools.annotation.atm.CurrentAccount;
import com.abram.java.special_tools.annotation.atm.User;
import com.abram.java.special_tools.annotation.atm.annotation.MethodLimit;
import com.abram.java.special_tools.annotation.atm.service.Operation;
import com.abram.java.special_tools.annotation.atm.service.Service;

public class CurrentService implements Service {

    private final double FIX_PRICE = 1000000;
    private final double BONUS = 2000;
    private final Operation operation = new Operation();

    @Override
    @MethodLimit(methodLimit = 9)
    public void depositMoneyIntoAccount(User user, Accounts accounts, double amount) throws NoSuchFieldException, IllegalAccessException {

        if (amount > FIX_PRICE) {
            for (Accounts account : user.getAccounts()) {
                if (account.getAccountType().equals(AccountType.DEBIT)) {
                    account.setBalance(account.getBalance() + BONUS);
                }
            }
        }
        accounts.setBalance(accounts.getBalance() + amount);
        operation.MethodLimit(accounts, this);
    }

    @Override
    @MethodLimit(methodLimit = 5)
    public void withdrawMoney(Accounts accounts, double amount) throws NoSuchFieldException, IllegalAccessException {
        CurrentAccount currentAccount = (CurrentAccount) accounts;
        if (amount < 30000 && currentAccount.getBalance() >= amount) {
            currentAccount.setBalance(currentAccount.getBalance() - amount);
        } else {
            System.out.println("Сумма не должна превышать 30 000");
            System.out.println("Ваш баланс: " + currentAccount.getBalance());
        }
        operation.MethodLimit(accounts, this);
    }
}
