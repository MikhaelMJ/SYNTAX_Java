package com.company.class17;

public class StudentsTester {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.studentName = "Jon";
        student1.studentId = "1";
        Student.numberOfStudents++;

        Student student2 = new Student();
        student2.studentName = "Misha";
        student2.studentId = "2";
        Student.numberOfStudents++;

        Student student3 = new Student();
        student3.studentName = "Mars";
        student3.studentId = "3";
        Student.numberOfStudents++;


        System.out.println(Student.numberOfStudents);
    }
}
