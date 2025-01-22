package com.example.observer;

public class Main {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    
    Display mainDisplay = new MainDisplay();
    Display alternateDisplay = new AlternateDisplay();

    weatherData.registerObserver(mainDisplay);
    weatherData.registerObserver(alternateDisplay);
    
    System.out.println("Updating temparature");
    weatherData.setTemperature(32.5f);
    System.out.println();

    System.out.println("Removing alternate display");
    weatherData.removeObserver(alternateDisplay);
    System.out.println();
    
    System.out.println("Updating humidity");
    weatherData.setHumidity(75.0f);
    System.out.println();
    
    System.out.println("Updating pressure");
    weatherData.setPressure(1.0f);
  }
}
