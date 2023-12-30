package org.example.work23.builder;

public class Director {
    public void constructorSportCar(Builder builder){
        builder.setName("sport");
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setColor(Color.RED);
    }
    public void constructorCityCar(Builder builder){
        builder.setName("city");
        builder.setCarType(CarType.CITY_CAR);
        builder.setColor(Color.BLACK);
    }
}
