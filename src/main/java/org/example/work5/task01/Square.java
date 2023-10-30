package org.example.work5.task01;

public class Square implements Shape{
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }
    @Override
    public double getArea() {
        return sideA*sideA;
    }
}
