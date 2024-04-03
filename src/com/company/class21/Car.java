package com.company.class21;

public class Car {
    String model;
    String make;
    int year;
    Car(){
        System.out.println("Пустой конструктор");
    }

    Car(String model){
        this.model=model;
        this.make="None";
        this.year=0;

    }

    Car(String model, String make){
        this.model=model;
        this.make=make;
        this.year=0;

    }
    Car(String make, String model, int year) {
        /*this.model=model;
        this.make=make;*/
        this(model,make);
        this.year=year;
    }

    void printInfo(){
        String model="Civic";
        String make="Honda";
        int year=2022;
        System.out.println(this.model+this.make+this.year);
    }
}
