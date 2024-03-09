package com.company.class16;

public class Task1 {
    public static void main(String[] args) {
        //создать строку которая будет соддержать предложение затем напечатать без пробелов

        String str="This is sentence with spaces";
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replaceAll(" ", ""));


    }
}
