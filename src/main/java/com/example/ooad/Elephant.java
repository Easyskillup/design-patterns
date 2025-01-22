package com.example.ooad;

public class Elephant extends TerrestrialAnimal {

  @Override
  public void move() {
  }

  @Override
  public void habitat() {
  }

  @Override
  public void food(FoodHabit foodHabit) {
    foodHabit.eat();
  }

}
