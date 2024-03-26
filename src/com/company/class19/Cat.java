package com.company.class19;

public class Cat {
    String name;
    int age;
    double height;
    double weight;

    Cat(String Name, int Age,double Height,
        double Weight){
        this.name=Name;
        this.age=Age;
        this.height=Height;
        this.weight=Weight;
        this.printInfo();
    }

    void printInfo(){
        System.out.println("Name "+name+" age "
                +age+" weight "+weight+" heght "
                +height);
    }
}

