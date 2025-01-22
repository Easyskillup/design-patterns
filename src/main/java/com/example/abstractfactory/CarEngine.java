package com.example.abstractfactory;

public class CarEngine implements Engine{

  @Override
  public void assemble() {
    System.out.println("Car engine...");
  }

}
