package com.company.class29;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLS");
        subjects.add("Manual Testing");
        Iterator<String> iterator= subjects.iterator();

        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(subjects);
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
    }
}
