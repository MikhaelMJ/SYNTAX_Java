package com.company.class21;

public class Person {
    private String name;
    int age;
    protected double height;
    public double weight;

    public void sleep(){
        System.out.println("Человек может спать");
    }
    protected void eat (){
        System.out.println("человек может есть");
    }
    private void walk(){
        System.out.println("человек может ходить");

    }
    public static void run(){
        System.out.println("человек может бегать");
    }
}
