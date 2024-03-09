package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String item;
		double price, money, total=0, change; 
		System.out.println("Что бы ты хотел купить?");
		item = in.nextLine();
		
		System.out.println("Сколько это стоит?");
		price = in.nextDouble();
		System.out.println("Оплатите товар");
				
		do {
			
			money = in.nextDouble();
			
			total+=money;
			
			if (total > price) {
				change=total-price;
				System.out.println("Возьмите сдачу "+ change);
				break;
			} else if (total < price) {
				System.out.println("Дай мне еще "+(price-total));
			}
		} while (total!=price);
		
		System.out.println("Возьмите товар");

	}

}
