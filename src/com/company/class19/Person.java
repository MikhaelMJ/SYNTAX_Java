package com.company.class19;

public class Person {
    String name;
    int age;
    double weight;
    double height;
    String education;
    //WIN ctrl+shift+/ - закоментить и раскоментить
    Person(){
        System.out.println("У меня есть что-то важное");
        name = "None";
        age = 30;
        weight = 50;
        height = 5.5;
        education = "None";
    }
    Person(String personName) {
        this();
        System.out.println("1 constructor");

        name = personName;

    }

    Person(String personName, int personAge){
        this(personName);
        System.out.println("1 constructor");
        age=personAge;


    }
    void ptintInfo(){
        System.out.println("Name "+name+" age "
                +age+" weight "+weight+" heght "
                +height+" education "+education);
    }
    Person(int personAge, String personName){
        System.out.println("2 constructor");
        name=personName;
        age=personAge;
        weight=50;
        height=5.5;
        education="None";

    }

}
