package org.example.work23.strategy;

public class Figure {
    Shape shape;
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public double returnArea(){
        return shape.getArea();
    }
}
