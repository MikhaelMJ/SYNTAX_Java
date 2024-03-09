package com.syntax.class05;

import java.util.Scanner;

public class InitializeVariable {

	public static void main(String[] args) {
		
		Scanner scan;
		int num1, num2, num3;
		
		scan=new Scanner(System.in);
		System.out.println("Пожалуйста введите 3 числа");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("Цифры одинаковые");
		} else {
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1 +" самое большое число");
			
		}else if (num2>num1 && num2>num3) {
			System.out.println(num2 +" самое большое число");
			
		}else if (num3>num1 && num3>num2) {
			System.out.println(num3 +" самое большое число");
		}else if (num1 == num2 && num2 == num3){
			System.out.println("Цифры одинаковые");
		}
		
	}

}
}
