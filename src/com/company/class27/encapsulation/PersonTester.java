package com.company.class27.encapsulation;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Misha");
        person.setAge(105);
        person.setWeight(125);
        /*person.name="Misha";
        person.age=16;
        person.weight=30;
        person.height=5;*/
        person.printInfo();

        Person person1=new Person();
        /*person.name="Mikki";
        person.age=120;
        person.weight=2000;
        person.height=15;
        person.printInfo();*/
    }
}
