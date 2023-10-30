package org.example.work5.task01;

public class Triangle implements Shape{
   private double sideA;
   private double sideB;
   private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double getArea() {
        if (((sideA+sideB)<sideC) || ((sideB+sideC)<sideA) || ((sideA+sideC)<sideB))
            return 0.0;
        double p = (sideA+sideB+sideC)/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
}
