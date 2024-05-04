package com.company.class31;

import java.util.*;

public class ListRecap {
    public static void main(String[] args) {
        List<String> grocery = new ArrayList<>();
        grocery.add("milk");
        grocery.add("cheese");
        grocery.add("eggs");
        grocery.add("butter");

        System.out.println("Извлечь элементы");

        for (String gros : grocery) {
            System.out.println(gros);
        }
        System.out.println("-----------------------------");

        for (int i = 0; i < grocery.size(); i++) {
            System.out.println(grocery.get(i));
        }
        System.out.println("-----------------------------");
        Iterator<String> iterator = grocery.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------Iter-----------");

        Set<String> car = new TreeSet<>();
        car.add("BMW");
        car.add("kia");
        car.add("toyota");
        car.add("honda");
        car.add("BMW");
        System.out.println(car.size());
        System.out.println("от набора к списку");

        Iterator<String> iterator1 = car.iterator();
        String c = iterator1.next();
        System.out.println(c);
        System.out.println("#########################");
        String cc=car.iterator().next();
        System.out.println(cc);

        List<String> carCopy = new ArrayList<>(car);
        System.out.println(carCopy);
        System.out.println(carCopy.get(2));

        List<String> carCopy2 = new ArrayList<>();
        carCopy2.addAll(car);
        System.out.println(carCopy);
        System.out.println(carCopy.get(2));
    }
}
