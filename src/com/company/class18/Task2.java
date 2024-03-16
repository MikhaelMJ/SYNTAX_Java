package com.company.class18;

public class Task2 {
    /*
    Создайте метод, который принимает в качестве параметра строку
параметр и возвращает обратно строку. Метод
должен быть доступен всем классам в вашем
проекта и доступен по имени класса
     */

    public String reverse(String inputStr) {
        return new StringBuilder(inputStr).reverse().toString();
    }

}
