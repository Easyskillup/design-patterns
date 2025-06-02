package com.example.behavioural.visitor;

import java.util.List;

public class VisitorPattern {

  public static void main(String[] args) {
    var shapes = List.of(
        new Circle(10.0, "Green"),
        new Rectangle(12.0, 6.5, "Red"));

    var drawingVisitor = new DrawingVisitor();
    var colouringVisitor = new ColouringVistor();

    shapes.forEach(shape -> {
      shape.accept(drawingVisitor);
      shape.accept(colouringVisitor);
      System.out.println();
    });
  }
}
