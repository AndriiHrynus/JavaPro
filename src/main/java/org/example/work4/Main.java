package org.example.work4;

public class Main {
    public static void main(String[] args) {
        Animal bobik = new Dog(500,10);
        Animal catcat = new Cat(200,0);
        bobik.run(150);
        catcat.swim(10);
        catcat.run(20);
        System.out.printf("Створено тварин: %d",Animal.count);
    }
}
