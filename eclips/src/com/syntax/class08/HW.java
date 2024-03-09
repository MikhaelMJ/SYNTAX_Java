package com.syntax.class08;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// Программа считывает диапазон 
		// чисел от пользователя
		
		Scanner scan;
		int start, end, evenSum=0, oddSum=0;
		
		scan = new Scanner(System.in);
		System.out.println("Введите начальное целое число");
		start=scan.nextInt();
		System.out.println("Введите конечное целое число");
		end=scan.nextInt();
		
		for (int i=start; i<=end; i++) {
			if (i%2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		
		System.out.println("Сумма четных чисел в диапазоне от "+start+" до "+end+" равно "+evenSum);
		System.out.println("Сумма нечетных чисел в диапазоне от "+start+" до "+end+" равно "+oddSum);

	}

}
