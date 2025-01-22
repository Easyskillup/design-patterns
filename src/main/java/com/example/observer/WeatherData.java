package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private float temperature;
  private float humidity;
  private float pressure;
  private List<Observer> observers;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  public float getTemperature() {
    return temperature;
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
    parametersChanged();
  }

  public float getHumidity() {
    return humidity;
  }

  public void setHumidity(float humidity) {
    this.humidity = humidity;
    parametersChanged();
  }

  public float getPressure() {
    return pressure;
  }

  public void setPressure(float pressure) {
    this.pressure = pressure;
    parametersChanged();
  }

  public void parametersChanged() {
    notifyObservers();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(o -> o.update(temperature, pressure, humidity));
  }

}
