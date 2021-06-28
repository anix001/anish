package com.anish.com.anish.day7.factory;

public class NullLogin extends Login{
    @Override
    public int LoginMethod() {
        System.out.println("no methods");
        return  0;
    }
}
