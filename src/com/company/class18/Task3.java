package com.company.class18;

public class Task3 {
    /*
        Создайте метод, который будет принимать в качестве параметра строку
параметр и возвращать новую строку, состоящую
только из гласных букв. Метод должен быть доступен
только внутри класса, где он был объявлен, и
выполняться путем вызова его имени
     */
  private static String onlyVowels(String inputStr) {
      return inputStr.replaceAll("[^aeiouAEIOU]","");
  }

    public static void main(String[] args) {
        System.out.println(onlyVowels("jaghifhiabciensobrj"));
    }
}
