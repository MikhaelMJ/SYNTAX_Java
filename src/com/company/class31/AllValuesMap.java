package com.company.class31;

import java.util.*;

public class AllValuesMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Oxana");
        map.put(202, "John");
        map.put(177, "Jake");
        map.put(90, "Mike");

        System.out.println("получаем значения");

        Collection<String> val = map.values();

        for (String str : val) {
            System.out.println(str);
        }
        System.out.println("==========================");
        Iterator<String> it = val.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("получаем ключи");

        Set<Integer> keys = map.keySet();
        for (int key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("==========================");
        Iterator<Integer> it2 = keys.iterator();
        while (it2.hasNext()) {
            int k = it2.next();
            System.out.println(k + " " + map.get(k));
        }
        System.out.println("========entry===========");

        Set<Map.Entry<Integer, String>> setEntr = map.entrySet();

        for (Map.Entry<Integer, String> entry:setEntr) {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println("========================");
        Iterator<Map.Entry<Integer, String>> it4 = setEntr.iterator();
        while (it4.hasNext()){
            Map.Entry<Integer, String> e = it4.next();
            System.out.println(e);
        }

    }
}
