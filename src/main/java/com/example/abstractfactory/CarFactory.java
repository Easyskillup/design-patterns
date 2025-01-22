package com.example.abstractfactory;

public class CarFactory implements VehicleFactory {

  @Override
  public Chasis createChasis() {
    return new CarChasis();
  }

  @Override
  public Engine createEngine() {
    return new CarEngine();
  }

}
