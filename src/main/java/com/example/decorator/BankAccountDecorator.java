package com.example.decorator;

public abstract class BankAccountDecorator implements BankAccount {

  protected BankAccount bankAccount;

  public BankAccountDecorator(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  @Override
  public double getBalance() {
    return bankAccount.getBalance();
  }

  @Override
  public void deposit(double amount) {
    bankAccount.deposit(amount);
  }

  @Override
  public void withdraw(double amount) {
    bankAccount.deposit(amount);
  }

}
