package com.example.abstractfactory;

public class CarChasis implements Chasis{

  @Override
  public void create() {
    System.out.println("Car chasis...");
  }

}
