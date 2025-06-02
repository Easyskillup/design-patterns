package com.example.creational.prototype;

/**
 * Creates a new object by cloning the existing object(prototype), rather than creating a new
 * instance.
 */
public class Main {
    public static void main(String[] args) {
        StockInstrument equity = new Equity("NSE", "CTS");
        equity.info();

        StockInstrument eqClone = equity.clone();
        eqClone.info();

    }
}
