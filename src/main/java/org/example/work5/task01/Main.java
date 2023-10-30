package org.example.work5.task01;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3.0), new Square(5.0), new Triangle(3.0,4.0,5.0)};
        System.out.println(sumArea(shapes));
    }
    private static double sumArea(Shape[] shapes){
        double result =0.0;
        for (int i=0;i<shapes.length; i++){
            result+=shapes[i].getArea();
        }
        return result;
    }
}
