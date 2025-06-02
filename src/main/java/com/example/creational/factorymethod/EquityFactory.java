package com.example.creational.factorymethod;

public class EquityFactory implements StockInstrumentFactory {

  @Override
  public StockIntrument createInstrument() {
    return new Equity();
  }

}
