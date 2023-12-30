package org.example.work23.factory;

public class FurnitureFactory {
    public Furniture createFurniture(FurnitureType furnitureType){
        Furniture furniture = null;
        switch (furnitureType){
            case SOFA:
                furniture = new Sofa();
                break;
            case CHAIR:
                furniture= new Chair();
                break;
            case TABLE:
                furniture = new Table();
        }
        return furniture;
    }
}
