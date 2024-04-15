package com.company.class27.demo2;

public class Tester {
    public static void main(String[] args) {
        Car car=new Mersedes();
        car.start();
        car.stop();
        Drivable drivable=new Mersedes();
        drivable.drive();
        ((Mersedes)drivable).start();
        ((Mersedes)drivable).stop();
    }
}
