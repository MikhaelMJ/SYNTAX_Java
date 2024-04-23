package com.company.class29.Set;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        HashSet<String> fruits=new HashSet<>();//не допускает повторений и отсутствует порядок
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        System.out.println(fruits);
    }
}
