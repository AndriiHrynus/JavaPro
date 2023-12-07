package org.example.work16.task2;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    List<T> list = new ArrayList<>();

    public boolean add(T fruit) {
        return (list.isEmpty() || list.get(0).getClass() == fruit.getClass()) ? list.add(fruit) : false;
    }
    public void addAll(List<T> fruits) {
        for (T element : fruits) {
            add(element);
        }
    }
    public float getWeight() {
        float sum = 0.0f;
        for (T element : list) {
            if (element instanceof Apple) sum += 1.0f;
            if (element instanceof Orange) sum += 1.54f;
        }
        return sum;
    }
    public boolean compare(Box<?> other) {
        return (this.getWeight()<other.getWeight())?true:false;
    }
    public void merge(Box<T> other){
        if(list.isEmpty()||other.list.isEmpty()
        ||list.get(0).getClass()==other.list.get(0).getClass()){
            list.addAll(other.list);
            other.list.clear();
            }
    }
}
