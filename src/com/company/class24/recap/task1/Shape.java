package com.company.class24.recap.task1;

public class Shape {
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
    void area(){
        System.out.println(Math.PI*Math.pow(radius,2));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.area();
    }
}
