package com.company.class28;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sule");
        System.out.println(person.getName());
        person.setAge(65);
        person.setSSN("123456");
        System.out.println(person.getAge("123456")); //нельзя вызвать метод когда строка null

    }
}
