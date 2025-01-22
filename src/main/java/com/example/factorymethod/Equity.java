package com.example.factorymethod;

public class Equity implements StockIntrument {

  @Override
  public void info() {
    System.out.println("Equity");
  }

}
