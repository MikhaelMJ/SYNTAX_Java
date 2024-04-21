package com.company.class28.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");

        for (String subject:subjects) {
            if (subject.length()>4)
                subjects.remove(subject);
        }
            
        }
    }

