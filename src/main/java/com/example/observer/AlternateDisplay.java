package com.example.observer;

public class AlternateDisplay implements Display {
  @Override
  public void update(float temp, float perssure, float humidity) {
    System.out.println("Alternate display");
    System.out.println("Temp = " + temp + " Pressure = " + perssure + " Humidity = " + humidity);
  }
}
