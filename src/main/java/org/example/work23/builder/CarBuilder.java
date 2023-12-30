package org.example.work23.builder;

public class CarBuilder implements Builder{
    private String name;
    private Color color;
    private CarType carType;
    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public void setColor(Color color) {
        this.color=color;
    }
    @Override
    public void setCarType(CarType carType) {
        this.carType=carType;
    }
    public Car getResult(){
        return new Car(name, color, carType);
    }
}
