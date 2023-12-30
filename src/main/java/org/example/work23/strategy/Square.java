package org.example.work23.strategy;

public class Square implements Shape{
    private double sideA;
    private double sideB;
    public Square(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double getArea() {
        return sideA*sideB;
    }
}
