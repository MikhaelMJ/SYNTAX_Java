package com.company.class20;

import com.company.class21.Person;

public class EmployeeFromRTester {
    public static void main(String[] args) {


        EmployeeFromRT employeeFromRT = new EmployeeFromRT();
        employeeFromRT.weight=50;
        Person.run();
        EmployeeFromRT.run();
        employeeFromRT.empId="123";
        employeeFromRT.takeLeaves();




    }
}