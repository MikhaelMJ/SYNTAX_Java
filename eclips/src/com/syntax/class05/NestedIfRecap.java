package com.syntax.class05;

import java.util.Scanner;

public class NestedIfRecap {

	public static void main(String[] args) {
		
		Scanner scan;
		String visa;
		int years;
		
		scan = new Scanner(System.in);
		System.out.println("Ты получил визу?");
		
		visa=scan.next();
		
		if (visa.equals("yes")) {
			System.out.println("Поздравляю, на какой срок?");
			
			years=scan.nextInt();
			
			if (years>1) {
				System.out.println("Это круто");
				
			}else {
				System.out.println("Тебе нужно приехать и продлить визу");
			}
		}


	}

}
