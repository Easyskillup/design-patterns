package com.example.structural.decorator.stocks;

public class RiskDecorator extends  StockInstrumentDecorator{
    public RiskDecorator(StockInstrument stockInstrument) {
        super(stockInstrument);
    }

    @Override
    public void info() {
        super.info();
        riskAnalysis();
    }

    private void riskAnalysis() {
        System.out.println("Including risk analysis");
    }

}
