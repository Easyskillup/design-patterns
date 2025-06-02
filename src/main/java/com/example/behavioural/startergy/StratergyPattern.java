package com.example.behavioural.startergy;

/**
 * Startergy interface
 */
interface PaymentStratergy {
  void pay(double amount);
}

/**
 * Concrete startergy implementations
 */
class CreditCardPayment implements PaymentStratergy {

  private final String cardNumber;

  public CreditCardPayment(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public void pay(double amount) {
    System.out.println("Paid: " + amount + " using credit card: " + cardNumber);
  }
}

class PayPalPayment implements PaymentStratergy {

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

  private PaymentStratergy paymentStratergy;

  public PaymentContext(){}

  public PaymentContext(PaymentStratergy paymentStratergy) {
    this.paymentStratergy = paymentStratergy;
  }

  public void setPaymentStratergy(PaymentStratergy paymentStratergy) {
    this.paymentStratergy = paymentStratergy;
  }

  public void pay(double amount) {
    paymentStratergy.pay(amount);
  }

}

public class StratergyPattern {
  public static void main(String[] args) {
    
    PaymentContext context = new PaymentContext();

    PaymentStratergy crediCard = new CreditCardPayment("12344");
    PaymentStratergy payPal = new PayPalPayment("Paypal01");

    context.setPaymentStratergy(crediCard);
    context.pay(1234.00);
    
    context.setPaymentStratergy(payPal);
    context.pay(1224.00);

  }
}
