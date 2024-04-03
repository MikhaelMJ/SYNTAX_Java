package com.company.class21;

public class Employee extends Person{
    String empId;
    double salary;
    void  work(){
        System.out.println("Employee "+empId+" " +
                "возраст "+age);
    }

    void getPaid (){
        System.out.println(empId+" is paid "+salary);
    }
}
