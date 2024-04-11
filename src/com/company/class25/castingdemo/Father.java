package com.company.class25.castingdemo;

public class Father {
    String name;
    Father(String name){
        this.name=name;
    }
    void sleep(){
        System.out.println(name+ "Люблю спать 5 часов");
    }
    void eat(){
        System.out.println(name+" Я люблю есть баклажаны");
    }
}
