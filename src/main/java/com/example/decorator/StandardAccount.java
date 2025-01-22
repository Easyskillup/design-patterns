package com.example.decorator;

// Standard implementation of the component interface
public class StandardAccount implements BankAccount {

  private double balance;

  public StandardAccount(double balance) {
    this.balance = balance;
  }

  @Override
  public double getBalance() {
    return balance;
  }

  @Override
  public void deposit(double amount) {
    balance += amount;
  }

  @Override
  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      System.out.println("After Withdrawal = " + balance);
    } else {
      System.err.println("Insufficient balance.");
    }
  }

}
