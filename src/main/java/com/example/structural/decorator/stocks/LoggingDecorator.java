package com.example.structural.decorator.stocks;

import java.time.LocalDateTime;

public class LoggingDecorator extends StockInstrumentDecorator{
    public LoggingDecorator(StockInstrument stockInstrument) {
        super(stockInstrument);
    }

    @Override
    public void info() {
        super.info();
        logInfo();
    }

    private void logInfo() {
        System.out.println("Audit logged: " + LocalDateTime.now());
    }
}
