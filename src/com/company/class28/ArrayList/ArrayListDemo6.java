package com.company.class28.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Misha");
        list.add("Vasya");
        list.add("Anna");
        list.add("Nina");
        System.out.println(list);
        list.remove("Misha");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}
