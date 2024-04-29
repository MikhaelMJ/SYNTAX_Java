package com.company.class30;

import java.awt.geom.Arc2D;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("rice", 5.6);
        grocery.put("pizza", 7.5);
        grocery.put("steak",10.1);
        grocery.put("pasta", 12.1);
        grocery.put("potato",13.1);
        grocery.put("beans", 13.2);
        grocery.put("banana", 13.5);
        grocery.put("watermelon", 15.5);

        Set<String> mapKeys = grocery.keySet();
        Iterator<String> iterator = mapKeys.iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            Double value = grocery.get(key);

            if (value<=10){
                iterator.remove();
            }
        }
        System.out.println(grocery);
    }
}
