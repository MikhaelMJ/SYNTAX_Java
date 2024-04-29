package com.company.class30;

import com.company.class27.demo3.Trustable;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> building = new TreeMap<>();
        building.put(1, "FB");
        building.put(2, "Google");
        building.put(3, "Netflix");
        building.put(4, "Amazone");
        building.put(5, "Google");
        building.put(6, "Apple");
        building.put(7, "IBM");
        building.put(1, "Apple");
        System.out.println(building);
        System.out.println(building.size());
        building.replace(4,"Adobe");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);


    }
}
