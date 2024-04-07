package com.company.class24.recap.task3;

public class Programming {
    Programming(){
        System.out.println("Я люблю програмировать");
    }
    Programming (String value){
        System.out.println("Я люблю "+value);
    }

    public static void main(String[] args) {
        new Programming();
        new Programming("Python");
    }

}
