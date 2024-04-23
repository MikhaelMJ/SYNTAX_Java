package com.company.class29.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class HW {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW X6");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Hyundai");
        cars.add("Lada granta");
        System.out.println("======================================");
        for (String car:cars) {//если обращаться только к элементам лучше использовать расширенный цикл for
            System.out.println(car);
        }
        System.out.println("======================================");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("=======================================");
        Iterator<String>iterator=cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
