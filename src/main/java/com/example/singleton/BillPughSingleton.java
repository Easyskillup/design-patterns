package com.example.singleton;

public class BillPughSingleton {

  private BillPughSingleton() {
  }

  private static class Inner {
    private static final BillPughSingleton instance = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return Inner.instance;
  }

}
