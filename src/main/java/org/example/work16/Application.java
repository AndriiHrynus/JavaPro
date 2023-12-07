package org.example.work16;

import java.util.ArrayList;
import java.util.List;
public class Application {
    public  static <T> List<T> toList(T[]arrays){
        List<T> list = new ArrayList<>();
        for (T element: arrays){
            list.add(element);
        }
        return list;
    }
}
