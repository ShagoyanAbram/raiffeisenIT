package com.abram.java.special_tools.annotation.atm.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MethodLimit {
    int methodLimit();
}
