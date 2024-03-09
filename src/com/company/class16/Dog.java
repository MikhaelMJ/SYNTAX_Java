package com.company.class16;

public class Dog {
    static int noOfLegas = 4;
    String name; //переменная экземпляра
    String Breed; //статическая переменная
    String color;

    void bark() {
        int times = 10;// локальная переменная
        for (int i = 0; i < times; i++) {
            System.out.println("Dog can bark");

        }
    }
}
