package com.example.state;

// Context class, pocesses a defualt state
public class Account {

  private String name;
  private double balance;
  private AccountState state;

  private Account() {
    state = new ActiveState();
  }

  public Account(String name, double balance) {
    this();
    this.name = name;
    this.balance = balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setState(AccountState state) {
    this.state = state;
  }

  public void withdraw(double amount) {
    state.withdraw(this, amount);
  }

  public void transfer(double amount) {
    state.transfer(this, amount);
  }

  public void deposit(double amount) {
    state.deposit(this, amount);
  }

}
