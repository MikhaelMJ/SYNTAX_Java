package com.company.class28.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Misha");
        list.add("Vasya");
        list.add("Anna");
        list.add("Nina");

        System.out.println(list.size());

        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Vasya");
        list1.add("Anna");
        list1.add("Nina");

        System.out.println(list);
        list.addAll(1,list1); //добавляет список list1 в список list с первого индекса
        System.out.println(list);
        list.add(list1.get(0));//добавляет элемент с индексом 0 списка list1 в список list
        System.out.println(list);
        list.add(1,list1.get(0));//добавляет элемент с индексом 0 списка list1 в список list под индексом 1
        System.out.println(list);

    }
}
