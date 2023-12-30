package org.example.work23.factory;

public class Furniture {
    public void makeFurniture(){
        System.out.println("make furniture "+this.getClass().getSimpleName());
    }
    public void deliveryFurniture(){
        System.out.println("delivery furniture "+this.getClass().getSimpleName());
    }
}
