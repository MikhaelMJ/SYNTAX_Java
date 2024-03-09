package com.syntax.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
		Scanner s;
		int num1, num2, num3, largest;
		
		s=new Scanner(System.in);
		System.out.println("Пожалуйста введите 3 числа");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		
		if (!(num1==num2 && num2==num3)) {
			
		
		if (num1>num3) {
			
			if (num1>num3) {
				largest=num1;
			}else { 
				largest=num3;
			}
		}else {
			if (num2>num3) {
				largest=num2;
			}else {
				largest=num3;
			}
			
		}
		System.out.println("Самое большое число "+largest);
		}
		

	}

}
