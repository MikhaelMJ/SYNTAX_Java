package com.company.class28;

public class Person {
    private String name;
    private int age;
    private String SSN;


    public void setName(String name) {

        if (name.length() < 20) {
            this.name = name;
        } else {
            System.out.println("Имя длолжно содержать менее 20 символов");

        }
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Возвраст не должен превышать 120 и быть меньше 0");
        }
    }

    void setSSN(String SSN) {
        if (SSN.length() > 0 && SSN.length() < 9) {
            this.SSN = SSN;
        } else {
            System.out.println("не подходит");
        }
    }

    String getName() {
        return name;
    }

    int getAge(String SSN) {
        if (this.SSN.equals(SSN)) {
            return age;
        } else {
            return 0;
        }
    }

    String getSSN(String password) {
        if (password.equals("123456")) {
            return this.SSN;
        } else {
            return null;
        }
    }


}

