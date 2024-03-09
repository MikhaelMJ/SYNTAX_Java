package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String sale;
		double price=0;
		int discount=0;
		double finalPrice;
	
		
		System.out.println("Здесь есть скидка сейчас?");
		sale = scan.nextLine();  
		
		if (sale.equals("да")) {
			
			System.out.println("Что вы хотели бы купить?");
			String item = scan.nextLine();
			
			System.out.println("Какова цена товара");
			price = scan.nextDouble();
			
			if (price >= 1 && price < 20 ) {
				discount = 10;
				
			} else if (price >= 20 && price < 100) {
				discount = 20;
				
			} else if (price >= 100 && price < 500) {
				discount = 30;
				
			} else if (price > 500) {
				discount = 50;
				
			} 
			
			finalPrice=price-(price*discount/100);
			
			System.out.println("После скидки "+discount+"% цена товара уменьшится до "+finalPrice+"$");
			
		}else {
			System.out.println("Не буду покупать сегодня");
		}

	}

}
