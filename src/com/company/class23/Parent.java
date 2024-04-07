package com.company.class23;

public class Parent {
    String name="akbulut";

    void printName(){
        System.out.println("Name "+name);
    }
    void getMarried(){
        System.out.println("my children will get marry by my choice");
    }
}

class Child extends Parent{
    String name="Enes";
    void printName(){

        System.out.println("Name is "+name);
        System.out.println("Name is "+this.name);
        System.out.println("Name is "+super.name);
    }
    void getMarried(){
        System.out.println("But i like someone else");
    }
    void letsDoSomethingCrazy(){
        getMarried();
        super.getMarried();//в методах можно вызывать ключевое super не только на первой строке, в конструкторах только на первой
    }
}
