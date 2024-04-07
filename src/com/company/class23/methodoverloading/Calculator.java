package com.company.class23.methodoverloading;

public class Calculator {
    void addInt(int num1, int num2){
        System.out.println(num1+num2);
    }
    void addDouble(double num1, double num2){
        System.out.println(num1+num2);

    }
    void addShort(short num1, short num2){
        System.out.println(num1+num2);
    }
    void addArray(int[]arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }
}
