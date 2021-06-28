package com.anish.com.anish.day7.payment;

public class EsewaPayment extends Payment{

    @Override
    public Object Pay() {
        return "Price is:" + paymentRequest.getCash() + "For Product" + paymentRequest.getProduct();
    }
}

