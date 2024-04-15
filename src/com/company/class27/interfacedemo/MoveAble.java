package com.company.class27.interfacedemo;

public interface MoveAble {
    void move();
}
interface ControlAble{
    void ControlAble();
}
interface SellAble{
    void sell();
}
interface AnotherInterface{
    void sell();
}
interface Car extends MoveAble,ControlAble,SellAble,AnotherInterface{

}
class Toyota implements SellAble, AnotherInterface{
    @Override
    public void sell() {
        System.out.println("You can sell");
    }
}