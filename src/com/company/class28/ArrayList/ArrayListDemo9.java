package com.company.class28.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo9 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");

        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).length()>4) {
                subjects.remove(i);
            }
        }
        System.out.println(subjects);
    }

}
