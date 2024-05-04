package com.company.class31.Task1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserClassInSet {
    public static void main(String[] args) {

        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Andrey", 101));
        students.add(new Student("Olena", 102));
        students.add(new Student("Serge", 103));
        students.add(new Student("Misha", 104));
        students.add(new Student("Ira", 105));
        System.out.println(students.size());
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student el = it.next();//необходимо сохранять в переменную
            System.out.println(el.name + " " + el.studentID);
        }
        System.out.println("=========================================");
        Iterator<Student> it1 = students.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next().name);// так не правильно, вернет исключение (не найден элемент)
            System.out.println(it1.next().studentID);
        }
    }
}
