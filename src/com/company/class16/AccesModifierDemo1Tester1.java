package com.company.class16;

import com.company.class17.AccesModifierDemo1;

public class AccesModifierDemo1Tester1 extends  AccesModifierDemo1{

    void mrthodAndSeparateClass() {
        System.out.println(city);
        System.out.println(height);
        method5();
    }
    public static void main(String[] args) {

        AccesModifierDemo1 accesModifierDemo1 = new AccesModifierDemo1();

         accesModifierDemo1.method4();

    }
}
