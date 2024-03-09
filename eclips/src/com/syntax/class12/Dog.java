package com.syntax.class12;

public class Dog {
	
	
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void bark() {
		System.out.println("Собака может лаить");
	}
	
	void sleep() {
		System.out.println("Собака может спать");
	}

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name="James";
		dog1.breed="Buul dog";
		dog1.color="White";
		dog1.age=20;
		dog1.height=15;
		dog1.gender='M';
		
		
		dog1.bark();
		dog1.sleep();
		
		Dog  dog2 = new Dog();
		dog2.name="Bongo";
		dog2.breed="shitzu";
		dog2.color="blue";
		dog2.age=100;
		dog2.height=10;
		dog2.gender='M';
		
		dog2.sleep();
		

	}

}
