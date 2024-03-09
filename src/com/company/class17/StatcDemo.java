package com.company.class17;

public class StatcDemo {
    String name="Blabla";
    static String country = "USA";
    void method(){
        System.out.println(name);
        System.out.println(country);
    }
    static void method2(){
       // System.out.println(name); имя это поле экземпляра, нельзя использовать напрямую
        StatcDemo statcDemo = new StatcDemo();
        System.out.println(statcDemo.name);
        statcDemo.method();
        method3();
    }
    static void method3(){
        System.out.println("static method 3");
    }
}
