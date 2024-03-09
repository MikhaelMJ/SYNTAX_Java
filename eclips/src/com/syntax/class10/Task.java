package com.syntax.class10;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		double sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Сколь вы хотите сохранить элементов");
		int size=scan.nextInt();
		double[] array = new double[size];
		
		
		
		for (int i=0; i<size; i++) {
			System.out.println("Введите элемент под индексом "+i);
			array[i]=scan.nextDouble();
			sum=sum+array[i];
		}
		
		System.out.println("Сумма чисел равна "+sum);

	}

}
