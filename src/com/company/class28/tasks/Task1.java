package com.company.class28.tasks;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Misha");
        name.add("Vasya");
        name.add("Jony");
        name.add("Anna");
        name.add("Nina");
        name.add("Jony");
        name.add("Misha");
       /* System.out.println(name.isEmpty());
        System.out.println(name.contains("Anna"));
        System.out.println(name.size());
        System.out.println(name);
        System.out.println(name.remove("Misha"));
        System.out.println(name);*/

        while (name.remove("Misha")){//удалить все дубликаты

        }
        System.out.println(name);
    }
}
