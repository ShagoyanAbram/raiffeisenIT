package com.abram.java.special_tools.annotation.atm.proxy;

import com.abram.java.special_tools.annotation.atm.Accounts;
import com.abram.java.special_tools.annotation.atm.service.impl.CurrentService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AccountsInvocationHandler implements InvocationHandler {
    private Accounts accounts;
    private CurrentService currentService;

    public AccountsInvocationHandler(Accounts accounts) {
        this.accounts = accounts;
    }

    public AccountsInvocationHandler(CurrentService currentService) {
        this.currentService = currentService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        long startTime = System.currentTimeMillis();
        System.out.println(method.getName()
                + " costs "
                + (System.currentTimeMillis() - startTime));
        if ((System.currentTimeMillis() - startTime) > 2000){

        }
        return result;
    }
}
