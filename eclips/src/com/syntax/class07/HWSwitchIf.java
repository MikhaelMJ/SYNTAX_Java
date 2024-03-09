package com.syntax.class07;

import java.util.Scanner;

public class HWSwitchIf {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double x, y, result = 0;
		char operator;
		String operation = null;
		System.out.println("Введите первое число");
		x = scan.nextDouble();
		System.out.println("Введите оператор (+,-,*,/)");
		operator = scan.next().charAt(0);
		System.out.println("Введите второе число");
		y = scan.nextDouble();
			
			if (operator == '+') {
				result = x + y;
				operation = "сложение";
			} else if (operator == '-') {
				result = x - y;
				operation = "вычитание";
			} else if (operator == '*') {
				result = x * y;
				operation = "умножение";
			} else if (operator == '/') {
				result = x / y;
				operation = "деление";
		    } else {
		    	System.out.println("Неправильный оператор");
		    } 
			
			System.out.println("Результат "+ operation + " " + x + " и " + y + " равно " + result);


}
}
