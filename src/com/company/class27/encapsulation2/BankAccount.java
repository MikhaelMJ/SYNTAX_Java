package com.company.class27.encapsulation2;

public class BankAccount {
    private String name;
    private double balance;
    private String userName;
    private String password;

    void setName(String name) {
        if (name.length() > 50) {
            System.out.println("превышено количество символов");
        } else if (name.replaceAll("[^A-Za-z]", "").length() != name.length()) {
            System.out.println("Есть специальные символы");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }


    public double getBalance(String password) {
        if (this.password.equals(password)){
            return balance;
        }else {
            return -1;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
