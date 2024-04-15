package com.company.class27.demo3;

public interface Trustable {
    void trust();
}

interface Bank extends Trustable {
    void hasChecking();
    void hasSaving();
    default void hasCreditCard(){
        System.out.println("Almost all of the banks have credit cards");//для функционального прогрммирования
    }
    static void depositMoney(){
        System.out.println("Можно внести депозит"); //для функционального прогрммирования
    }
}
class FinancialInstitution {
    public void financing(){
        System.out.println("ALL the financial institures deal with financial transaction");
    }
}
class BOA extends FinancialInstitution implements Bank{
    @Override
    public void trust() {
        System.out.println("You can trust BOA for your money");
    }

    @Override
    public void hasChecking() {
        System.out.println("You can trust BOA for your money");
    }

    @Override
    public void hasSaving() {
        System.out.println("BOA has 2 saving accounts");
    }
}