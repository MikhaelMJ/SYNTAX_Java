package com.company.class19;

public class Task2 {
    String name;
    double subject1Marks;
    double subject2Marks;
    double subject3Marks;

    Task2(String name, double subject1Marks, double subject2Marks,
          double subject3Marks) {
        this.name = name;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    void printAvg() {
        System.out.println("Средняя оценка "+(subject1Marks+subject2Marks+subject3Marks)/3);
    }

}
