package com.company.class27.demo2;

public interface Drivable {
    boolean FAST=true;
    void drive();
}
abstract class Car {
    public void stop(){
        System.out.println("Car can stop");
    }
    public abstract void start();
}
class Mersedes extends Car implements Drivable{

    @Override
    public void drive() {
        System.out.println("Mersedes can drive");
    }

    @Override
    public void start() {
        System.out.println("Mersedes can start");
    }
}