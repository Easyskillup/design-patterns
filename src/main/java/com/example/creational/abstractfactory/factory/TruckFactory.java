package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.Chasis;
import com.example.creational.abstractfactory.Engine;
import com.example.creational.abstractfactory.TruckChasis;
import com.example.creational.abstractfactory.TruckEngine;

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
