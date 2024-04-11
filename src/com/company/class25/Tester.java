package com.company.class25;

public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee("Abdul");
        employee.performDailActivities();
        Student student = new Student("Misha");
        student.performDailActivities();
        Teacher teacher = new Teacher("Masha");
        teacher.performDailActivities();
    }

}
