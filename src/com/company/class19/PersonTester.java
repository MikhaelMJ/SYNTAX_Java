package com.company.class19;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {

        Person person1 = new Person("Mikhail",
                35);
        person1.ptintInfo();

        Scanner scanner=new Scanner(System.in);
        Person person2=new Person(scanner.next(),
                scanner.nextInt());
        person2.ptintInfo();
    }
}
