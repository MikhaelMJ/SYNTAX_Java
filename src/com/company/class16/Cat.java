package com.company.class16;

public class Cat {
    static int noOfLegs=4;
    String name;

    static void display() {
        System.out.println(noOfLegs);
        //System.out.println(name); в статическом методе нельзя вызывать переменную экземпляра
    }

    void display2() {
        System.out.println(noOfLegs);
    }
}
