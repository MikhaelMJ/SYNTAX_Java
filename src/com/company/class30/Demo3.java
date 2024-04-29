package com.company.class30;

import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Egg", 12.0);
        map.put("tomato", 5.5);
        map.put("milk", 2.5);
        map.put("potato", 4.2);
        map.put("steak", 3.5);
        System.out.println(map);
        map.put(null, null);
        map.put("shirt", null);
        map.put(null, 5.0);
        map.put("orange", null);
        System.out.println(map);
        map.replace("milk",5.5);//заменить значение
        System.out.println(map);
        System.out.println(map.containsKey("Egg"));//метод проверки существования конкретного ключа
        System.out.println(map.isEmpty()); //проверяет пустая ли карта
    }
}
