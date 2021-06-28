package com.anish.com.anish.day7.payment;

public class PaymentFactory {

    public  static  Payment get(PaymentType paymentType){
        switch (paymentType){
            case ESEWA:
                return new EsewaPayment();
        }
        return  null;
    }
}
