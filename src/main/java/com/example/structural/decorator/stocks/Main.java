package com.example.structural.decorator.stocks;

public class Main {
    public static void main(String[] args) {
        StockInstrument core = new BasicStockInstrument("CTS");
        core.info();
        System.out.println();

        StockInstrument riskDecorator = new RiskDecorator(core);
        riskDecorator.info();
        System.out.println();

        StockInstrument fullyDecorated = new LoggingDecorator(riskDecorator);
        fullyDecorated.info();
        System.out.println();
    }
}

