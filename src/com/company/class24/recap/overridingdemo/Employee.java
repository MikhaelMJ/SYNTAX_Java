package com.company.class24.recap.overridingdemo;

public class Employee {
    double salary;
    String name;
    Employee(String name,double salary){
        this.salary=salary;
        this.name=name;
    }
    void getPaid(){
        System.out.println(name+" is getting paid "+salary+"/anum");
    }
}
class Constructor extends Employee{
    Constructor(String name, double salary) {
        super(name, salary);

    }
    @Override
    void getPaid(){
        System.out.println(name+" is getting paid "+salary+"/hourly");
    }

}
class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Misha",1000000);
        fullTimeEmployee.getPaid();
        Constructor constructor = new Constructor("xeca",45);
        constructor.getPaid();
    }

    }

