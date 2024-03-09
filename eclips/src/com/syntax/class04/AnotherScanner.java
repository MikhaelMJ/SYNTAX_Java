package com.syntax.class04;

import java.util.Scanner;

public class AnotherScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//запишем фио
		System.out.println("Введите имя");
		String name=input.nextLine();
		
		System.out.println("Введите фамилию");
		String lastName=input.nextLine();
		
		System.out.println("Из какой страны ты");
		String country=input.nextLine();
		
		System.out.println("Приятно познакомиться "+name+" "+lastName+" из "+country);
		
		

	}

}
