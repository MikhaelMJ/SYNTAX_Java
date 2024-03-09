package com.syntax.class04;

import java.util.Scanner; //win  CTRL+SHIFT+O

public class ExampleOfScanner {
	
	public static void main(String[] args) {
		
		String name = "Serge";
		System.out.println("Hello "+name);
		
		Scanner scan = new Scanner(System.in);//создаем сканер
		
		System.out.println("Please enter your name");
		
		String value=scan.nextLine();//запечатлите строку
		
		System.out.println("Привет "+value);
		
		//фиксируем числовые значения
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		System.out.println(value+" is "+age+" year old");
	
	}

}
