package com.anish.com.anish.day7.factory;

public class LoginFactory {

    public static Login get(LoginType loginType){

        switch (loginType){
            case FB:
                return new FbLogin();

            case GMAIL:
                return new  GmailLogin();
            default:
                return new NullLogin();
        }
    }
}
