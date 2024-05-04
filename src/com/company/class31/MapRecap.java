package com.company.class31;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRecap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(101, "Oxana");
        map.put(202, "John");
        map.put(177, "Jake");
        map.put(90, "Mike");
        System.out.println(map.size());
        System.out.println(map);


    }
}
