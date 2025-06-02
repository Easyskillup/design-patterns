package com.example.behavioural.state;

/*
 * State pattern
 * When you want to introduce different behaviours to an object based on the 
 * change of it's state, especially useful when you want to change the bhaviour 
 * of an object at runtime.
 * 
 * Context
 * Class whose behaviour changes in the runtime and pocesses a current state.
 * 
 * State  
 * Interface or abstract class that defines the behaviour associated with particular state.
 * 
 * ConcreteState
 * Specific implementations of state.
 */
public class StatePattern {

  public static void main(String[] args) {

    Account account = new Account("Ashish", 1000.0);

    System.out.println("State == ACTIVE");
    account.deposit(500);
    account.withdraw(300);
    account.transfer(200);

    System.out.println("State == SUSPENDED");
    account.setState(new SuspendedState());
    account.deposit(500);
    account.withdraw(300);
    account.transfer(200);
    System.out.println();

    System.out.println("State == BLOCKED");
    account.setState(new BlockedState());
    account.deposit(500);
    account.withdraw(300);
    account.transfer(200);
    System.out.println();
  }
}
