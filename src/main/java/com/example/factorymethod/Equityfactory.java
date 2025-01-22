package com.example.factorymethod;

public class Equityfactory implements StockInstrumentFactory {

  @Override
  public StockIntrument createIntrument() {
    return new Equity();
  }

}
