package com.company.class29.Set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits=new TreeSet<>();//не допускает повторений и есть сортировка по алфавиту
        fruits.add("Z");
        fruits.add("B");
        fruits.add("A");
        fruits.add("D");
        fruits.add("D");
        System.out.println(fruits);
    }
}
