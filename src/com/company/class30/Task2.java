package com.company.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1, "Misha");
        student.put(2, "Nina");
        student.put(3, "Olya");
        student.put(4, "Yulya");
        student.put(5, "Masha");

        Collection<String> values = student.values();
        for (String students:values) {
            System.out.println(students);
        }
        Set<Integer> keys = student.keySet();
        for (Integer key:keys){
            System.out.println(key);
        }
    }
}
