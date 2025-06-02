package com.example.creational.prototype;

public class Equity implements StockInstrument {
    private String exchange;
    private String symbol;

    public Equity(String exchange, String symbol) {
        this.exchange = exchange;
        this.symbol = symbol;
    }

    @Override
    public StockInstrument clone() {
        return new Equity(this.exchange, this.symbol);
    }

    @Override
    public void info() {
        System.out.println("Equity " + symbol + " on " + exchange);
    }
}
