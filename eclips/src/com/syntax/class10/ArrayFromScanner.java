package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Сколь вы хотите сохранить элементов");
		int size=scan.nextInt();
		
		int[] num = new int[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Введите элемент под индексом "+i);
			num[i]=scan.nextInt();
		}
		
		System.out.println("распечатать элементы");
		
		for(int n:num) {
			System.out.print(n+"  ");
		}

	}

}
