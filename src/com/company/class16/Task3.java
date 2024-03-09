package com.company.class16;

public class Task3 {
    public static void main(String[] args) {
        // сколько предложений содедржится в данноой строке
        String str="Is it sunday? Is it raining? Do we have a java Class today";
        System.out.println(str.split("[?]").length);
    }
}
