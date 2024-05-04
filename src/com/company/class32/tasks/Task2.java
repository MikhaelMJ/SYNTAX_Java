package com.company.class32.tasks;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USE", "Washington");
        countries.put("Italy","Rome");
        countries.put("Russia", "Moscow");
        countries.keySet();
        countries.values();
        System.out.println(countries.keySet());
        for (String key:countries.keySet()) {
            System.out.println(key);
            //если нужно что то сделать, что менеяет размер, нужно использовать iterator
        }
        Iterator<String> it = countries.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            if(key.length()>5){
                //it.remove();
            }
        }
        System.out.println(countries);

        System.out.println("========================================");
        Iterator<Map.Entry<String,String>> entry=countries.entrySet().iterator();
        while (entry.hasNext()){
            Map.Entry<String,String>  next = entry.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"  "+value);
        }
    }
}
