package com.company.class16;

public class Task2 {
    public static void main(String[] args) {
        //создать строку с разными символами и вывести количество буквенных символов в строке
        // отфарматировать код CTL+ALT+L windows

        String str = "adsdjlFGHJ254352&*%$$##";
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());


    }
}
