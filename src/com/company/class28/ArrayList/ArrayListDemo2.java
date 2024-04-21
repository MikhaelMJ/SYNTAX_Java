package com.company.class28.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();//не рекомендуется(ошибки во время выполнения намного затратнее чем во время компиляции
        arrayList.add(10);
        arrayList.add("add");
        ArrayList arrayList1=new ArrayList();// тоже принимает все типы данных
    }
}
