package com.company.class17;

public class AccesModifierDemo1 {
    private String name;
    int age;
    public double height;
    protected String city;

    public void method4() {
        System.out.println(height);
    }

    private void method1() {
        System.out.println(name);
        System.out.println(age);
    }

    void method2() {
        System.out.println(name);
        System.out.println(age);
        method1();
    }

    protected void method5() {
        System.out.println(name);
        System.out.println(age);
    }


    public static void main(String[] args) {
        //System.out.println(name);нет доступа main статический метод
        AccesModifierDemo1 accesModifierDemo1 = new AccesModifierDemo1();
        System.out.println(accesModifierDemo1.name);
        accesModifierDemo1.method1();
        accesModifierDemo1.method5();
    }
}
