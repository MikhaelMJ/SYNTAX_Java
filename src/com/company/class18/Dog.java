package com.company.class18;

public class Dog {
    String name;
    int age;
    double height;
    double weight;
    String breed;
    String color;
    static int noOflegs=4;


    Dog(String dogName){
        name=dogName;
        age=10;
        height=10;
        weight=10;
        breed="Taksa";
        color="Black";
    }
    Dog(String dogName,  int dogAge, double dogHeight,
         double dogWeight, String dogBreed, String dogColor) {
        name = dogName;
        age = dogAge;
        height = dogHeight;
        weight = dogWeight;
        breed = dogBreed;
        color = dogColor;
    }
    Dog(String dogName, int dogAge){
        name=dogName;
        age=dogAge;
        height=10;
        weight=10;
        breed="Taksa";
        color="Black";
    }
    void printDogInfo(){
        System.out.println("Name "+name+" Age"+age+" Height"+height+" Breed"+breed+" color"+color);
    }

}
