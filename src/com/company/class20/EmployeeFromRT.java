package com.company.class20;

import com.company.class21.Person;

public class EmployeeFromRT extends Person {
    String empId;
    double salary;
    void  work(){
        System.out.println("Employee "+empId+" " +
                "рост "+height);
    }

    void getPaid (){
        System.out.println(empId+" is paid "+salary);
    }
    public static void takeLeaves(){
        System.out.println("сотрудники могут брать отпуск");
    }
}


