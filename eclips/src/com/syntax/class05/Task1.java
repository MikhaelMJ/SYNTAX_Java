package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner variable = new Scanner(System.in);
		System.out.println("Пожалуйста введите свой вес");
		int height = variable.nextInt();
		if (height < 60) {
			System.out.println("Легкий");
		}else if (height >= 60 && height < 72) {
			System.out.println("Средний");
		}else if(height > 72) {
			System.out.println("Толстый");
		}else {
			System.out.println("Введите корректный вес");
		}
		

	}

}
