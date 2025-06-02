package com.example.creational.factorymethod;

public class MutualFundFactory implements StockInstrumentFactory {
    @Override
    public StockIntrument createInstrument() {
        return new MutualFund();
    }
}
