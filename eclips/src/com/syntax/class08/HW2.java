package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int money;
		System.out.println("Заплати за конфету");
		
		do {
			
			money = in.nextInt();
			
			if (money > 3) {
				System.out.println("Дай мне меньше денег");
			} else if (money < 3) {
				System.out.println("Дай мне больше денег");
			}
		} while (money!=3);
		
		System.out.println("Наслаждайся конфетой");

	}

}
