package com.example.abstractfactory;

public interface VehicleFactory {
  Chasis createChasis();
  Engine createEngine();
}
