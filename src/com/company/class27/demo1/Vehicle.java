package com.company.class27.demo1;

public abstract class Vehicle {
    String vinNumber;
    static int totalNumberOfVehicle;

    Vehicle(String vinNumber) {
        this.vinNumber = vinNumber;
        totalNumberOfVehicle++;
        System.out.println("Vehicle constructor");
    }

    private void display() {

    }

    static void displayTotalVehicle() {
        System.out.println("Мы создали " + totalNumberOfVehicle
                + " транспортных средств");
    }

    public void drive() {
        System.out.println("Может ехать");
    }

    protected void stop() {
        System.out.println("Транспорт может останавливаться");
    }

    public abstract void start();

    abstract void speed();
}

abstract class Car extends Vehicle {
    String carType;
    public Car(String carType,String vinNumber) {
        super(vinNumber);
        this.carType=carType;
        System.out.println("Car constructor");
    }

    @Override
    public void speed() {
        System.out.println("Максимальная скорость 400");
    }
    public abstract void breaking();
}
class BMW extends Car{
    String make;
    String model;

    public BMW(String make,String model,String carType, String vinNumber) {
        super(carType, vinNumber);
        this.make=make;
        this.model=model;
        System.out.println("BMW constructor");
    }
    @Override
    public void start() {
        System.out.println("BMW can start remotely");
    }
    @Override
    public void breaking() {
        System.out.println("BMW can break");
    }
    public void displayInfo(){
        System.out.println("We build "+make+" "+model+" with carType "
                +carType+
                " with VinNumber "+vinNumber);
    }

}

class Toyota extends Car {
    String make;
    String model;

    Toyota(String make, String model, String carType, String vinNumber) {
        super(carType, vinNumber);
        this.make = make;
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Toyota can start remotel");
    }

    @Override
    public void breaking() {
        System.out.println("Toyota can break");
    }

    public void displayInfo() {
        System.out.println("We build " + make + " " + model + " with carType "
                + carType +
                " with VinNumber " + vinNumber);
    }
}