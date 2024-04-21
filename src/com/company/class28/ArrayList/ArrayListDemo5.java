package com.company.class28.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Misha");
        list.add("Vasya");
        list.add("Anna");
        list.add("Nina");

        for (String name:list) {
            System.out.println(name);
        }
        System.out.println("====================================");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
