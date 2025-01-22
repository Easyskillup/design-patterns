package com.example.abstractfactory;

public class TruckChasis implements Chasis{

  @Override
  public void create() {
    System.out.println("Truck chasis...");
  }

}
