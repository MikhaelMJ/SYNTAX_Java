package com.company.class25.task2;

public class CreditCardTester {
    public static void main(String[] args) {
        /*CreditCard creditCard=new CreditCard(1000);
        creditCard.calculateInterest();
        Visa visa = new Visa(1000);
        visa.calculateInterest();
        AX ax= new AX(1000);
        ax.calculateInterest();*/
        CreditCard creditCard1=new AX(120);
        creditCard1.calculateInterest();
        //AX ax=(AX) new CreditCard(120);//ошибка
        AX ax2=(AX)creditCard1;

    }
}
