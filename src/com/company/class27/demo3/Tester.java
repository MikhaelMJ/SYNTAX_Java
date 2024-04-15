package com.company.class27.demo3;

public class Tester {
    public static void main(String[] args) {
        Trustable trustable=new BOA();
        trustable.trust();
        System.out.println("==================");
        Bank bank=new BOA();
        bank.trust();
        bank.hasChecking();
        bank.hasSaving();
        bank.hasCreditCard();

        Bank.depositMoney();
        System.out.println("==================");

        BOA boa=new BOA();
        boa.trust();
        boa.hasChecking();
        boa.hasSaving();
        boa.hasCreditCard();
        boa.financing();
    }
}
