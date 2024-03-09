package com.company.class16;

public class Task4 {
    public static void main(String[] args) {
        //перевернуть слово за словом
        String str = "This is a sentence that i want to reverse";
        String[] arr = str.split(" ");
        String reversed = "";
        for (String s : arr) {
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.reverse();
            reversed += stringBuilder + " ";

        }
        System.out.println(reversed);


    }
}
