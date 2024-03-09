package com.company.class17;

public class AccesModifierDemo1Tester {
    public static void main(String[] args) {
        AccesModifierDemo1 accesModifierDemo1 = new AccesModifierDemo1();
       // System.out.println(accesModifierDemo1.name); доступ закрыт,
        //потому что поле закрыто
        accesModifierDemo1.method5();
        System.out.println(accesModifierDemo1.city);


    }
}
