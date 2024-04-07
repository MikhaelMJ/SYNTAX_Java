package com.company.class24.recap;

public class Overload {
    void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method with String[] args");
    }

    public static void main(String arg) {
        System.out.println("Inside the main method with String arg");

    }

    public static void main(int arg) {
        System.out.println("Inside the main method with int arg");

    }

}
