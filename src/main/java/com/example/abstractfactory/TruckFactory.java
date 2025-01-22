package com.example.abstractfactory;

public class TruckFactory implements VehicleFactory {

  @Override
  public Chasis createChasis() {
    return new TruckChasis();
  }

  @Override
  public Engine createEngine() {
    return new TruckEngine();
  }

}
