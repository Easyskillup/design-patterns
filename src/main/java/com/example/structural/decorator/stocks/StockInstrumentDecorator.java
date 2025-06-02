package com.example.structural.decorator.stocks;

public abstract class StockInstrumentDecorator implements StockInstrument {
    protected StockInstrument stockInstrument;

    public StockInstrumentDecorator(StockInstrument stockInstrument) {
        this.stockInstrument = stockInstrument;
    }

    @Override
    public void info() {
        stockInstrument.info();
    }
}
