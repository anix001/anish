package com.anish.com.anish.day7.factory;

public class LoginMain {
    public static void main(String[] args) {
        Login login = LoginFactory.get(LoginType.GMAIL);
        System.out.println(login.LoginMethod());
    }
}
