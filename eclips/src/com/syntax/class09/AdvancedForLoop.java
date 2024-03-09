package com.syntax.class09;

public class AdvancedForLoop {

	public static void main(String[] args) {
		
        int[] numbers= {100, 20, 67, 45, 90, 23};
		
		for (int o=0; o<numbers.length; o++) {
			System.out.println(numbers[o]);
		}
		
		System.out.println("-----for each loop-------");
		
		for(int num:numbers) {
			System.out.println(num+" ");
		}
		
		System.out.println("в обратном порядке");
		
		for (int i=numbers.length-1; i>=0; i--) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("-----HW------");
		
		// Д/з создать массив целых чисел и вычислить сумму всех целых элементов
		
		 int[] num= {100, 20, 30, 4, 90, 40};
		 
		 
		 for (int d=0; d<num.length; d++) {
			    int sum = 0;
				sum = sum + num[d];
			}
		 

	}

}
