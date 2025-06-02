package com.example.creational.abstractfactory;

public class CarEngine implements Engine{

  @Override
  public void assemble() {
    System.out.println("Car engine...");
  }

}
