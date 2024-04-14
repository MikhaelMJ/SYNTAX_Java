package com.company.class25.task3;

public class Student {
    void study(){
        System.out.println("Студенты учаться");
    }
    void doHomeWork(){
        System.out.println("Студенты делают ДЗ");
    }
    void practice(){
        System.out.println("Студенты делают практику");
    }
}

class SyntaxStudent extends Student{
    void study(){
        System.out.println("Студенты учаться Syntax");
    }
    void doHomeWork(){
        System.out.println("Студенты делают код");
    }
    void doResearch (){
        System.out.println("Тестируют ПО");
    }
}
class CollegeStudent extends Student{
    void doHomeWork(){
        System.out.println("Делают ДЗ чтобы получать хорошие оценки");
    }
}

class SchoolStudent extends Student{

}