package com.company.class29.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Night");
        words.add("Day");
        words.add("Sun");
        words.add("Moon");
        System.out.println(words.contains("Lion"));
        System.out.println(words.contains("Day"));
        words.clear();//метод очистки
        System.out.println(words);

        ArrayList<String> otherList=new ArrayList<>();
        otherList.add("Cat");
        otherList.add("Moon");
        System.out.println(words.containsAll(otherList));//проверяет содержание элементов из другого списка

    }
}
