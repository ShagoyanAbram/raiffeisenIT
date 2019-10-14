package com.abram.java.special_tools.annotation.atm.service;

import com.abram.java.special_tools.annotation.atm.Accounts;
import com.abram.java.special_tools.annotation.atm.annotation.Loggable;
import com.abram.java.special_tools.annotation.atm.annotation.MethodLimit;
import com.abram.java.special_tools.annotation.atm.annotation.OperationLimit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Operation {
    public void MethodLimit(Accounts value, Service service) throws NoSuchFieldException, IllegalAccessException {
        Class thisClass = service.getClass();
        Method[] methods = thisClass.getMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(MethodLimit.class)) {
                MethodLimit methodLimit = m.getAnnotation(MethodLimit.class);
                int methodCount = value.getMethodCount();
                if (methodCount == 2 * methodLimit.methodLimit()) {
                    System.out.println("limit is reached");
                    return;
                } else {
                    Field field = value.getClass().getSuperclass().getDeclaredField("methodCount");
                    field.setAccessible(true);
                    int count = field.getInt(value) + 1;
                    field.set(value, count);
                }
            }
        }
    }

    public boolean checkLoggable() {
        boolean loggable = false;
        Class thisClass = Accounts.class;
        Annotation[] annotations = thisClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Loggable) {
                Loggable mAnnotation = (Loggable) annotation;
                loggable = mAnnotation.loggable();
            }
        }
        return loggable;
    }

    public boolean OperationLimit() throws NoSuchFieldException, IllegalAccessException {

        int stopOperation = 0;
        boolean result = true;
        Class thisClass = Accounts.class;
        Annotation[] annotations = thisClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof OperationLimit) {
                OperationLimit mAnnotation = (OperationLimit) annotation;
                stopOperation = mAnnotation.operationLimit();
            }
        }
        if (Accounts.operationCount == stopOperation) {
            result = false;
        } else {
            Accounts.operationCount++;
        }
        return result;
    }
}
