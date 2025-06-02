package com.example.behavioural.state;

public interface AccountState {
  void deposit(Account account, double amount);

  void withdraw(Account account, double amount);

  void transfer(Account account, double amount);
}





