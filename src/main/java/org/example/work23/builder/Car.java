package org.example.work23.builder;

public class Car {
    private String name;
    private Color color;
    private CarType carType;
    public Car(String name, Color color, CarType carType) {
        this.name = name;
        this.color = color;
        this.carType = carType;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", carType=" + carType +
                '}';
    }
}
