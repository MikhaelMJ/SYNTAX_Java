package com.company.class27.demo1;

public class VehicleTester {
    public static void main(String[] args) {

        BMW bmw = new BMW("BMW", "X5",
                "Sedan", "123");

        bmw.drive();
        bmw.start();
        bmw.stop();
        //bmw.toString(); наследование от Object class
        bmw.displayInfo();
        Vehicle.displayTotalVehicle();

        Car car=new Toyota("Toyota", "Varis", "Sedan", "456");
        ((Toyota)car).displayInfo();
    }
}
