package com.example.structural.decorator.stocks;

// The core features which needs to be present in every StockInstrument
public class BasicStockInstrument implements StockInstrument {
    private String symbol;

    public BasicStockInstrument(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void info() {
        System.out.println("Stock symbol: " + symbol);
    }
}
