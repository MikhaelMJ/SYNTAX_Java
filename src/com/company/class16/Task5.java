package com.company.class16;

public class Task5 {
    public static void main(String[] args) {
        //является ли слово полиндромом
        String str="aba";
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println("слово полиндром");
        }else {
            System.out.println("не полиндром");
        }
    }
}
