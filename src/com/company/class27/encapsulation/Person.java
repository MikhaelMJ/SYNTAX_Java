package com.company.class27.encapsulation;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public void setName(String name) {
        if (name.length() < 15) {
            this.name = name;
        } else {
            System.out.println("запрещено");
        }
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("запрещено");
        }
    }

    public void setWeight(int weight) {
        if (weight > 0 && weight < 150) {
            this.weight = weight;
        } else {
            System.out.println("запрещено");
        }
    }

    String getName(){
        return name;
    }

    void printInfo() {
        if (age == 0) {
            System.out.println("что-то не так");
        } else {
            System.out.println("name " + name + " age " + age + " weight " + weight + " height " + height);
        }
    }
}