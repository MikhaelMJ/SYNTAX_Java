package com.company.class29.ArrayListDemo;

import java.util.ArrayList;

public class FlowerTester {
    public static void main(String[] args) {
        Flower [] flowers = {new Rose("Rose","Pink"),
        new Tulip("Tulip","Red")};

        ArrayList<Flower>flowers1=new ArrayList<>();
        flowers1.add(new Rose("Rose","Pink"));
        flowers1.add(new Tulip("Tulip","Red"));
        flowers1.add(new Sunflower("Sunflower","Yellow"));

        for (Flower flower:flowers) {
            flower.bloom();
        }
    }
}
