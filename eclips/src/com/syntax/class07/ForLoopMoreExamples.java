package com.syntax.class07;

public class ForLoopMoreExamples {

	public static void main(String[] args) {
		
		//таблица умножения
		
		int num=1;
		
		for (int i=1; i<=10; i++) {
			
			System.out.println(num+" X "+i+" = "+num*i);
		}
		
		System.out.println("---------------------------");
		
		int sum=0;
		
		for (int i=1; i<=5; i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);

	}

}
