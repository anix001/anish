package com.anish.com.anish.day7.payment;

public abstract class Payment {

  protected PaymentRequest paymentRequest;

  public void initializeRequest(PaymentRequest paymentRequest){
    this.paymentRequest = paymentRequest;
  }


  public Boolean Validate () {
    if(paymentRequest.getCash() != null){
      int value = paymentRequest.getCash().compareTo(0D);
      if(value == 1){
        return true;
      }
      return  false;
    }
    return  true;
  }




    public abstract Object Pay();
}
