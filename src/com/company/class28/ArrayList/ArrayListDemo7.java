package com.company.class28.ArrayList;

import java.util.ArrayList;
//удаляет элементы из первого списка, которые есть во втором
public class ArrayListDemo7 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Misha");
        name.add("Vasya");
        name.add("Jony");
        name.add("Anna");
        name.add("Nina");
        name.add("Olya");
        name.add("Kesha");
        name.add("Misha");

        ArrayList<String> name1 = new ArrayList<>();
        name1.add("Misha");
        name1.add("Vasya");
        name1.add("Olya");

        name.removeAll(name1);
        System.out.println(name);
    }
}
