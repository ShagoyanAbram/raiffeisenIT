package com.abram.java.special_tools.annotation.atm;

import com.abram.java.special_tools.annotation.atm.proxy.AccountsInvocationHandler;
import com.abram.java.special_tools.annotation.atm.service.Service;
import com.abram.java.special_tools.annotation.atm.service.impl.CurrentService;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        List<Accounts> listAccountsProxy = new ArrayList<>();
//        Accounts accountsProxy = new Accounts(7755,35000, AccountType.CURRENT);
//        listAccountsProxy.add(accountsProxy);
//        User userProxy = new User();
//        userProxy.setAccounts(listAccountsProxy);

        User user = new User();
        List<Accounts> accounts = new ArrayList<>();
        accounts.add(new DebitAccount(1234, 100));
        accounts.add(new CreditAccount(2345, 777));
        accounts.add(new CurrentAccount(3456, 888));
        user.setAccounts(accounts);

        Service serviceProxy =
                (Service) Proxy.newProxyInstance(
                        Service.class.getClassLoader(),
                        new Class[]{Service.class},
                        new AccountsInvocationHandler(new CurrentService())
                );

//        serviceProxy.depositMoneyIntoAccount(userProxy, accountsProxy, 100);
//        System.out.println(accountsProxy.getBalance());
        int acc = 3456;
        int acc2 = 2345;
        for (int i = 0; i < 10; i++) {
            for (Accounts a : accounts) {
                if (a.accountNumber == acc || a.accountNumber == acc2) {
                    a.depositMoneyIntoAccount(user, 10000000);
                }
            }
//            Accounts accounts1 = accounts.stream().filter(a -> a.getAccountType().equals(AccountType.DEBIT)).findFirst().get();
//            System.out.println(accounts1.getBalance());
       }
    }
}
