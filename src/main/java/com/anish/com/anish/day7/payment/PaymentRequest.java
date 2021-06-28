package com.anish.com.anish.day7.payment;

public class PaymentRequest {

    public String Product;
    public Double Cash;

    public PaymentRequest(String product, Double cash) {
        this.Product = product;
        this.Cash = cash;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public Double getCash() {
        return Cash;
    }

    public void setCash(Double cash) {
        Cash = cash;
    }
}
