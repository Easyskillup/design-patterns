package com.example.behavioural.state;

public class SuspendedState implements AccountState {

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
