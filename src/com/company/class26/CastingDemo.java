package com.company.class26;

public class CastingDemo {
    public static void main(String[] args) {
        Object[] objects = {"Hi",10,'A'};
        for(Object obj:objects){
            if(obj instanceof String) {
                System.out.println(((String) obj).length());
            }
        }
    }
}
