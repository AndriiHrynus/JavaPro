package org.example.work4;

public class Animal {
    private int  lengthRun;
    private int lengthSwim;
    public static int count = 0;

    public Animal(int lengthRun, int lengthSwim) {
        this.lengthRun = lengthRun;
        this.lengthSwim = lengthSwim;
        count++;
    }
    public void run(int length){
        if(length<lengthRun){
            System.out.printf("%s пробіг %dм", getClass().getSimpleName(), length);
        } else {
            System.out.println("Більше ліміту");
        }
    }
    public void swim(int length){
        if(length<lengthSwim){
            System.out.printf("%s проплив %dм", getClass().getSimpleName(), length);
        } else {
            System.out.println("Більше ліміту");
        }
    };
}
