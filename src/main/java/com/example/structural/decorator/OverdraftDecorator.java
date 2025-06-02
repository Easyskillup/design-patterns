package com.example.structural.decorator;

public class OverdraftDecorator extends BankAccountDecorator {

  private double overDraftLimit;

  public OverdraftDecorator(BankAccount bankAccount, double overDraftLimit) {
    super(bankAccount);
    this.overDraftLimit = overDraftLimit;
  }

  @Override
  public void withdraw(double amount) {
    System.out.println("Overdraft amount = " + overDraftLimit);
    System.out.println("Current balance = " + bankAccount.getBalance());
    if (amount <= bankAccount.getBalance() + overDraftLimit) {
      bankAccount.withdraw(amount);
    } else {
      System.err.println("Withdrawal exceeded overdraft limit.");
    }

  }

}
