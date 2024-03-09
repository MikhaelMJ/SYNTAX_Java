package com.company.class16;

public class SyntaxStudentTester {
    public static void main(String[] args) {

        SyntaxStudents student1 = new SyntaxStudents();
        student1.name="Serge";
        student1.age=22;
        student1.id="123";
        student1.displeyFee();
        SyntaxStudents.schoolName="Syntax tech";
        System.out.println(SyntaxStudents.schoolName);

        SyntaxStudents student2 = new SyntaxStudents();
        student2.name="Dimon";
        student2.age=18;
        student2.id="2345";
        System.out.println(SyntaxStudents.schoolName);

    }


}
