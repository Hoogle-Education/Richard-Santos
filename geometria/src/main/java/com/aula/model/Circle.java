package com.aula.model;

import com.aula.model.enums.Color;

public class Circle extends AbstractShape {
  
  public static final double PI = 3.14159265;

  private double radius;

  public Circle(double thick, Color color, double radius) {
    super(thick, color);
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return PI*radius*radius;
  }

  @Override
  public double getPerimeter() {
    return 2*PI*radius;
  }

}
