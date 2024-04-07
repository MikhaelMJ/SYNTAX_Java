package com.company.class24.recap.task3;

public class Task4 {

    private void sayHello() {
        System.out.println("Hi there");
    }

    private void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    private void sayHello(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.sayHello();
    }
}

