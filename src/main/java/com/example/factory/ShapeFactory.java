package com.example.factory;

public class ShapeFactory {

  private ShapeFactory() {
  }

  public static Shape createShape(String type) {
    if (type.equals("circle")) {
      return new Circle();
    } else if (type.equals("square")) {
      return new Square();
    } else {
      throw new IllegalArgumentException("Type not supported");
    }
  }
}
