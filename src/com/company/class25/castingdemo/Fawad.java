package com.company.class25.castingdemo;

public class Fawad extends Father {

    Fawad(String name) {
        super(name);
    }

    void sleep() {
        System.out.println(name + " Любит спать 8 часов");
    }

    void eat() {
        System.out.println(name + " Любит есть мясо");
    }

}

