package com.example.state;

public interface AccountState {
  void deposit(Account account, double amount);

  void withdraw(Account account, double amount);

  void transfer(Account account, double amount);
}

class ActiveState implements AccountState {
  
  @Override
  public void transfer(Account account, double amount) {
    System.out.println("Transferring money: " + amount + " from " + account.getName() + "'s account.");
    if (amount <= account.getBalance()) {
      account.setBalance(account.getBalance() - amount);
      System.out.println("Transferred: " + amount + "from account.");

    } else {
      System.out.println("Account does not have enough money.");
      System.out.println("Remaining balance: " + account.getBalance());
    }
    System.out.println("Final balance: " + account.getBalance());
    System.out.println();
  }

  @Override
  public void deposit(Account account, double amount) {
    System.out.println("Depositing money: " + amount + " to " + account.getName() + "'s account.");
    System.out.println("Account balance: " + account.getBalance());
    account.setBalance(account.getBalance() + amount);
    System.out.println("Final balance: " + account.getBalance());
    System.out.println();
  }

  @Override
  public void withdraw(Account account, double amount) {
    System.out.println("Withdraing money: " + amount + " from " + account.getName() + "'s account.");
    if (amount <= account.getBalance()) {
      account.setBalance(account.getBalance() - amount);
      System.out.println("Withdrew: " + amount + "from account.");

    } else {
      System.out.println("Account does not have enough money.");
      System.out.println("Remaining balance: " + account.getBalance());
    }
    System.out.println("Final balance: " + account.getBalance());
    System.out.println();
  }
}

class SuspendedState implements AccountState {

  @Override
  public void transfer(Account account, double amount) {
    System.err.println(account.getName()
        + " you are not allowed to transfer money. Account is SUSPENDED.");
  }

  @Override
  public void deposit(Account account, double amount) {
    System.out.println("Depositing money " + amount + " to " + account.getName() + "'s account.");
    System.out.println("Account balance: " + account.getBalance());
    account.setBalance(account.getBalance() + amount);
    System.out.println("Final balance: " + account.getBalance());
    System.out.println();
  }

  @Override
  public void withdraw(Account account, double amount) {
    System.err.println(account.getName()
        + " you are not allowed to withdraw money. Account is SUSPENDED.");

  }
}

class BlockedState implements AccountState {

  @Override
  public void transfer(Account account, double amount) {
    System.err.println(account.getName()
        + " you are not allowed to transfer money. Account is BLOCKED.");

  }

  @Override
  public void deposit(Account account, double amount) {
    System.err.println(account.getName()
        + " you are not allowed to deposit money. Account is BLOCKED.");

  }

  @Override
  public void withdraw(Account account, double amount) {
    System.err.println(account.getName()
        + " you are not allowed to withdraw money. Account is BLOCKED.");

  }
}
