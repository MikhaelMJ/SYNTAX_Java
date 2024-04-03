package com.company.class21;

public class Developer extends Employee{

    String programmingLanguage;
    void code(){
        System.out.println("Разработчика ID "+empId+" Разработчика возраст "+age+" умеет програмировать на "
                +programmingLanguage);}

        public static void main(String[] args) {
            Developer developer = new Developer();
            developer.empId="123";
            developer.age=50;
            developer.programmingLanguage="Java";
            developer.code();
            developer.work();
            developer.sleep();

        }




}