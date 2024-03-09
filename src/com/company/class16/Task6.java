package com.company.class16;

public class Task6 {

    public static void main(String[] args) {
        //
        String str="String one";
        String str2="String two";
        str=str+str2;
        str2=str.substring(0,str.length()-str2.length());
        str=str.substring(str2.length());
        System.out.println(str);
        System.out.println(str2);
    }
}
