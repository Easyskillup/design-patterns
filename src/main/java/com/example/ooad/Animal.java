package com.example.ooad;

public abstract class Animal {

  private String species;
  private String colour;

  public String getColour() {
    return colour;
  }

  public String getSpecies() {
    return species;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public abstract void move();

  public abstract void habitat();

  public abstract void food(FoodHabit foodHabit);
}
