package com.company.class16;

public class SyntaxStudents {
    static String schoolName = "Syntax";
    static int courseDuration = 6;
    String name;
    String id;
    int age;

    double calculateFee() {
        int var1=10;
        int var2=20;
        return var1*var2+100;
    }
    void displeyFee() {
        System.out.println(name+ " hgas to pay" + calculateFee());
    }
}
