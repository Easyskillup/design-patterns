package com.example.creational.abstractfactory;

public class TruckEngine implements Engine{

  @Override
  public void assemble() {
    System.out.println("Truck engine...");
  }

}
