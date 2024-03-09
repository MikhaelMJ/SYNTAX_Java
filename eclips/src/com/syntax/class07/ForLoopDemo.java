package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		//сказать привет 5 раз
		
		for(int i=1; i<=5; i++) {
			System.out.println("Привет");
		}
		
		System.out.println("напечатать от 1 до 10");
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("от 20 до 10");
		
		for (int i=20; i>=10; i--) {
			System.out.print(i +" ");
		}
		
		System.out.println("напечатать нечетные от 10 до 100");
		
		for (int i = 1; i<=100; i++) {
			
			if (i%2 != 0) {
			System.out.print(i+" ");
			}
		}

	}

}
