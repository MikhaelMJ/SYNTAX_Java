package com.company.class28;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        int[] arr2 = new int[20];
        arr2[2] = 1542;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10");
        arrayList.add("20");
        arrayList.add("30");
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        arrayList.set(2,"1000");

    }
}
