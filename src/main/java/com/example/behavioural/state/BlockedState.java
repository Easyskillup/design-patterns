package com.example.behavioural.state;

public class BlockedState implements AccountState {

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

