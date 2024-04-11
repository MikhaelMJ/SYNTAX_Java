package com.company.class25.task1;

public class Degree {
    void getPrerequisite(){
        System.out.println("To need a degree you need to pass high school diploma");
    }
}
class Bachelors extends Degree{


}
class  Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a  Masters degree you need a Bachelors degree first");
    }
}
