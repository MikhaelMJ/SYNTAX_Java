package com.company.class29.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits=new LinkedHashSet<>();//не допускает повторений и есть порядок
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        System.out.println(fruits);
    }
}
