package com.example.observer;

public class MainDisplay implements Display {

  @Override
  public void update(float temp, float perssure, float humidity) {
    System.out.println("Main display");
    System.out.println("Temp = " + temp + " Pressure = " + perssure + " Humidity = " + humidity);
  }

}
