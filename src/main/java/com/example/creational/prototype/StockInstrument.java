package com.example.creational.prototype;


public interface StockInstrument extends Cloneable {
    StockInstrument clone();
    void info();
}
