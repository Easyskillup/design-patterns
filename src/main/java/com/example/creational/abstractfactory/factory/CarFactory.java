package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.CarChasis;
import com.example.creational.abstractfactory.CarEngine;
import com.example.creational.abstractfactory.Chasis;
import com.example.creational.abstractfactory.Engine;

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
