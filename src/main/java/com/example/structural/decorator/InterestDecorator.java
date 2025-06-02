package com.example.structural.decorator;

public class InterestDecorator extends BankAccountDecorator {

  private double interest;

  public InterestDecorator(BankAccount bankAccount, double interest) {
    super(bankAccount);
    this.interest = interest;
  }

  @Override
  public double getBalance() {
    System.out.println("Interest % = " + interest);
    System.out.println("Interest amount = " + (bankAccount.getBalance() * (interest / 100)));
    return bankAccount.getBalance() + (bankAccount.getBalance() * (interest / 100));
  }
}
