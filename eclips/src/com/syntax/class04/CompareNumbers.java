package com.syntax.class04;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		
		//сравнить два числа
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Введите первое число");
		int num1=data.nextInt();
		
		System.out.println("Введите 2е число");
		int num2=data.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" больше числа "+num2);
		} else if(num1<num2) {
			System.out.println(num1+" меньше числа "+num2);
		} else {
			System.out.println(num1+" равно "+num2);
		}

	}

}
