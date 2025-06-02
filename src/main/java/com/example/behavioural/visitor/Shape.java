package com.example.behavioural.visitor;

/**
 * Element - Defines an accept method that takes a Visitor as an argument
 */
abstract class Shape {

  private String colour;

  public Shape() {
  }

  public Shape(String colour) {
    this.colour = colour;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  abstract void accept(Visitor visitor);
}

/**
 * Concrete Element - Implementation of the Element
 */

class Circle extends Shape {

  private double radius;

  public Circle() {
  }

  public Circle(double radius, String colour) {
    super(colour);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visitCircle(this);
  }
}

class Rectangle extends Shape {

  private double length;
  private double breadth;

  public Rectangle(){}

  public Rectangle(double length, double breadth, String colour){
    super(colour);
    this.length = length;
    this.breadth = breadth;
  }

  public double getLength() {
    return length;
  }

  public double getBreadth() {
    return breadth;
  }

  public void setBreadth(double breadth) {
    this.breadth = breadth;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visitRectangle(this);
  }
}
