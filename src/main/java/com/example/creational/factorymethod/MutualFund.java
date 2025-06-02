package com.example.creational.factorymethod;

public class MutualFund implements StockIntrument{

  @Override
  public void info() {
    System.out.println("Mutual Fund");
  }

}
