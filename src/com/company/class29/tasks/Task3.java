package com.company.class29.tasks;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Fanta");
        drinks.add("Coke");
        drinks.add("Wine");
        drinks.add("Bear");
        drinks.add("Rum");
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("e")||drinks.get(i).contains("a")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
