package com.abram.homework.three.atm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        List<Accounts> accounts = new ArrayList<>();
        accounts.add(new DebitAccount(1234, 100));
        accounts.add(new CreditAccount(2345, 777));
        accounts.add(new CurrentAccount(3456, 888));
        user.setAccounts(accounts);

        int acc = 3456;
        List<Accounts> accList = user.getAccounts();
        for (Accounts a : accList) {
            if (a.accountNumber == acc) {
                a.depositMoneyIntoAccount(user, 10000000);
            }
        }
        Accounts accounts1 = accounts.stream().filter(a -> a.getAccountType().equals(AccountType.DEBIT)).findFirst().get();
        System.out.println(accounts1.getBalance());
    }
}
