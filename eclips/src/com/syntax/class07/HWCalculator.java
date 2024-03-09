package com.syntax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Пожалуйста введите 2 разных числа");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result=0;
		System.out.println("Пожалуйста введите оператор");
		String operator = scan.next();
		
		switch(operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		
		if (result!=0) {
		System.out.println(num1 +" " + operator + " " + num2 + " = " + result);
		}

	}

}
