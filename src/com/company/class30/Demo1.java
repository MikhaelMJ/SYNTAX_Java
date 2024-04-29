package com.company.class30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Oxana");
        arrayList.add("Mars");
        arrayList.add("Olena");
        arrayList.add("Sharif");
        arrayList.add("Hamza");

        Map<Integer,String> map = new HashMap<>();
        map.put(111,"Ehsan");
        map.put(222,"Maria");
        map.put(333, "Misha");
        map.put(444, "Gosha");
        map.put(555, "Olena");
        map.put(666, "Dima");
        map.put(777,"Misha");//ключ уникален, значение может повторятся
        map.put(222,"Vasya");//переопределит значение в ключе
        System.out.println(map.get(444));
    }
}
