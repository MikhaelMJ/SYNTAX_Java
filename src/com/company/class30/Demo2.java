package com.company.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>(); //сортировка ключей
        map.put(123, "Misha");
        map.put(124, "Misha1");
        map.put(125, "Misha2");
        map.put(126, "Misha3");
        map.put(127, "Misha4");

        Map<Integer,String> map2 = new HashMap<>();//случайный порядок
        map2.put(1234, "Misha");
        map2.put(1245, "Misha1");
        map2.put(1256, "Misha2");
        map2.put(1267, "Misha3");
        map2.put(1278, "Misha4");

        //map2.putAll(map); //объеденение двух карт
        System.out.println(map2);
        map2.remove(1234);
        System.out.println(map2.get(1267));//получение значение по ключу
        System.out.println(map2);


    }
}
