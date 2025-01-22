package com.example.startergy;

/**
 * Startergy interface
 */
interface PaymentStartergy {
  void pay(double amount);
}

/**
 * Concrete startergy implementations
 */
class CreditCardPayment implements PaymentStartergy {

  private final String cardNumber;

  public CreditCardPayment(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public void pay(double amount) {
    System.out.println("Paid: " + amount + " using credit card: " + cardNumber);
  }
}

class PayPalPayment implements PaymentStartergy {

  private final String payPalId;

  public PayPalPayment(String payPalid) {
    this.payPalId = payPalid;
  }

  @Override
  public void pay(double amount) {
    System.out.println("Paid: " + amount + " using PayPal: " + payPalId);
  }
}

/**
 * Context
 */
class PaymentContext {

  private PaymentStartergy paymentStartergy;

  public PaymentContext(){}

  public PaymentContext(PaymentStartergy paymentStartergy) {
    this.paymentStartergy = paymentStartergy;
  }

  public void setPaymentStartergy(PaymentStartergy paymentStartergy) {
    this.paymentStartergy = paymentStartergy;
  }

  public void pay(double amount) {
    paymentStartergy.pay(amount);
  }

}

public class StratergyPattern {
  public static void main(String[] args) {
    
    PaymentContext context = new PaymentContext();

    PaymentStartergy crediCard = new CreditCardPayment("12344");
    PaymentStartergy payPal = new PayPalPayment("Paypal01");

    context.setPaymentStartergy(crediCard);
    context.pay(1234.00);
    
    context.setPaymentStartergy(payPal);
    context.pay(1224.00);

  }
}
