package com.company.class32.tasks;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> building = new TreeMap<>();
        building.put(1, "FB");
        building.put(2, "Google");
        building.put(3, "Netflix");
        building.put(4, "Amazon");
        building.put(5, "Google");
        building.put(6, "Apple");
        building.put(7, "IBM");
        System.out.println(building);
        building.put(1, "Apple");
        System.out.println(building);
        System.out.println(building.get(2));
        System.out.println(building.size());
        building.replace(4,"Tesla");
        System.out.println(building);
        building.remove(5);
        System.out.println(building);
    }
}
