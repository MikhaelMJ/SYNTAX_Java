package com.company.class25.task2;

public class CreditCard {
    double balance;
    double interest;
    CreditCard(double balance){
        this.balance=balance;

    }
    void calculateInterest(){
        interest=balance*0.15;
        System.out.println("year interest is "+interest);
    }
}
class Visa extends CreditCard{

    Visa(double balance) {
        super(balance);
    }
}
class AX extends CreditCard{

    AX(double balance) {
        super(balance);
    }

    void calculateInterest(){
        interest=balance*0.10;
        System.out.println("year interest is "+interest);
    }
}
