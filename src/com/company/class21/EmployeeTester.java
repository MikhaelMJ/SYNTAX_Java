package com.company.class21;

public class EmployeeTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.age=10;
        person.eat();
        person.sleep();

        Employee employee = new Employee();
        employee.age=15;
        employee.salary=10000;
        employee.work();
        employee.getPaid();
;
    }
}
