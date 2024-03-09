package com.syntax.class04;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Введите город");
		String city=input.nextLine();
		
		System.out.println("Укажите температуру в вашем городе");
		double temp=input.nextDouble();
				
		System.out.println(temp+" в городе "+city);
		
		
	}

}
