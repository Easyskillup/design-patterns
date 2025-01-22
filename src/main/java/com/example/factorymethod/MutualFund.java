package com.example.factorymethod;

public class MutualFund implements StockIntrument{

  @Override
  public void info() {
    System.out.println("Mutual Fund");
  }

}
