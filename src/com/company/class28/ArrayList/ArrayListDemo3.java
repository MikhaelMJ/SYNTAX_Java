package com.company.class28.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10");
        arrayList.add("20");
        arrayList.add("20");
        arrayList.add("30");
        System.out.println(arrayList);
        arrayList.remove("30");
        System.out.println(arrayList);
        arrayList.add(2,"50");
        System.out.println(arrayList);

    }
}
