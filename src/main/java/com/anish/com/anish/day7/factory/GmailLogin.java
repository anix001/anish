package com.anish.com.anish.day7.factory;

public class GmailLogin extends Login{
    @Override
    public int LoginMethod() {
        System.out.println("Hello Gmail");
        return 0;
    }
}
