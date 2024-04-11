package com.company.class25.castingdemo;

public class Tester {
    public static void main(String[] args) {
        Father father = new Son("Abdul");
        father.sleep();
        father.eat();
        //abdullah.playGames ошибка

        Father[] abdullahArray=new Father[5];

        Son son=(Son) father;
        son.playGames();


        father = new Fawad("Fawad");

        Object[] objects={"sojoigf",1256,'a',false};






    }
}
