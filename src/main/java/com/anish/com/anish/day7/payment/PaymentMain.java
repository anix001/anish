package com.anish.com.anish.day7.payment;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.get(PaymentType.ESEWA);
        payment.initializeRequest(new PaymentRequest("Kitkat", 60D));
        System.out.println(payment.Pay());
    }
}
