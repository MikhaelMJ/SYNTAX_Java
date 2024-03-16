package com.company.class18;

public class Task2Tester {
    public static void main(String[] args) {

     Task2 task2 = new Task2();
        System.out.println(task2.reverse("Sunday"));
        //лямбда выражение:
        System.out.println(new Task2().reverse("Sunday"));

    }
}
