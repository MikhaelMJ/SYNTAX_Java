package com.company.class26.HW;

public class ComputerTester {
    public static void main(String[] args) {
        Apple apple = new Apple();

        Computer [] computers={new Apple(),
                new Lenovo(),new HP(), new Dell()};
        for (Computer computer : computers){
            computer.browseInternet();
            computer.openFiles();
        }
        }
    }


