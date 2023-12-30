package org.example.work23.factory;

public class FurnitureShop {
    private final FurnitureFactory furnitureFactory;
    public FurnitureShop(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }
    public Furniture orderFurniture(FurnitureType furnitureType){
        Furniture furniture = furnitureFactory.createFurniture(furnitureType);
        furniture.makeFurniture();
        furniture.deliveryFurniture();
        return furniture;
    }
}
