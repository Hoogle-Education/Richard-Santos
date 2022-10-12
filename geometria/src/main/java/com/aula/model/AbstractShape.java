package com.aula.model;

import com.aula.model.enums.Color;

public abstract class AbstractShape implements Shape {
  
  private double thick;
  private Color color;
  
  public AbstractShape(double thick, Color color) {
    this.thick = thick;
    this.color = color;
  }

  public double getThick() {
    return thick;
  }

  public void setThick(double thick) {
    this.thick = thick;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

}
