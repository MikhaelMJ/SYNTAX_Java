package com.company.class26.HW;

public class Computer {
    int Memory;
    double price;
    String make;
    Computer(){
        System.out.println("Computer");
    }
    void browseInternet() {
        System.out.println("Умеет открывать инет");
    }

    void openFiles() {
        System.out.println("открывает файлы");
    }

}

class Apple extends Computer {
    Apple(){
        System.out.println("Apple");
    }
    void useItunes() {
        System.out.println("Можно использовать Itunes");
    }
    void browseInternet() {
        System.out.println("Умеет открывать инет Safary");
    }
}

class Lenovo extends Computer {
    Lenovo(){
        System.out.println("Lenovo");
    }
    void vantageApp() {
        System.out.println("Использование Vantage");
    }
    void browseInternet() {
        System.out.println("Умеет открывать инет Chrome");
    }
}
class HP extends Computer{
    HP(){
        System.out.println("HP");
    }
    void HPSmart(){
        System.out.println("Использование HPSmart");
    }
    void browseInternet() {
        System.out.println("Умеет открывать инет Firefox");
    }
}
class Dell extends Computer{
    Dell(){
        System.out.println("Dell");
    }
    void DellSupport(){
        System.out.println("Использование DellSupport");
    }
    void browseInternet() {
        System.out.println("Умеет открывать инет IE");
    }
}