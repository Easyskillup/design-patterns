package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.Chasis;
import com.example.creational.abstractfactory.Engine;

public interface VehicleFactory {
  Chasis createChasis();
  Engine createEngine();
}
