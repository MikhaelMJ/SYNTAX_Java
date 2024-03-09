package com.syntax.class07;

import java.util.Scanner;

public class MoreWhile {

	public static void main(String[] args) {
		
		Scanner scan;
		String name;
		int age;
		
		scan=new Scanner(System.in);
		
		int i=1;
		
		while (i<=3) {
		System.out.println("Как вас зовут");
		name=scan.next();
		
		System.out.println(name +" укажите свой возвраст");
		age=scan.nextInt();
		
		System.out.println(name +" " + age +" лет");
		i++;
		}
		
	}

}
