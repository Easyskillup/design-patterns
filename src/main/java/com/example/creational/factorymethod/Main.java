package com.example.creational.factorymethod;

/**
 * Factory Method Pattern
 */
public class Main {
    public static void main(String[] args) {
        StockInstrumentFactory factory;
        StockIntrument instrument;

        // Equity
        factory = new EquityFactory();
        instrument = factory.createInstrument();
        instrument.info();

        // Mutual Fund
        factory = new MutualFundFactory();
        instrument = factory.createInstrument();
        instrument.info();
    }
}
