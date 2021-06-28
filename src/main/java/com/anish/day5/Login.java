package com.anish.day5;

public abstract class Login implements LoginContact {
    @Override
    public void isValidUser(){
        System.out.println("checking the user data in database or not");
    }

    public void Process(){
        isValidUser();
        FetchFromSource();
    }
}
