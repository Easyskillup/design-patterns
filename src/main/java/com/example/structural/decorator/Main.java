package com.example.structural.decorator;

public class Main {

  public static void main(String[] args) {
    BankAccount account = new StandardAccount(1000.0);

    System.out.println("Depositing 100");
    account.deposit(100);
    System.out.println("Balance = " + account.getBalance());
    account.withdraw(1200);
    System.out.println("Balance after withdrawal = " + account.getBalance());

    // System.out.println();
    // account = new InterestDecorator(account, 5.0);
    // System.out.println("Balance = " + account.getBalance());

    System.out.println();
    account = new OverdraftDecorator(account, 100.0);
    account.withdraw(1099);
    System.out.println("Balance = " + account.getBalance());
  }
}
