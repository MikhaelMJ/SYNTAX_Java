package com.company.class25.castingdemo;

public class Son extends Father {

    Son(String name) {
        super(name);
    }
    void sleep(){
        System.out.println(name+" Любит спать 20 часов");
    }
    void eat(){
        System.out.println(name+" Любит есть все подряд");

    }
    void playGames(){
        System.out.println(name+" Я умею играть в игры");
    }
}
