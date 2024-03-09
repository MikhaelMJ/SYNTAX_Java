package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		for (int i =0; i<=50; i++) {
			
			if (i % 3 == 0) {
				continue;
			}
			
			System.out.print(i+" ");
			
		}
		
		System.out.println("---------Task2-------------");
		
		Scanner scan = new Scanner(System.in);
		String credit;
		do {
			System.out.println("Хотите оформить кредитную карту?");
			credit = scan.next();
			if (credit.equals("да")) {
				break;
			}
			
		} while (true);
		

	}

}
