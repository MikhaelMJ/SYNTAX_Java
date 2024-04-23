package com.company.class29.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("10");
        words.add("nine");
        words.add("great");
        words.add("like");
        words.add("nike");
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String word= iterator.next();
            if (word.endsWith("e")||word.endsWith("E")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }

}
