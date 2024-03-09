package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		
		Scanner in;
		String country, traditionalFood;
		
		in=new Scanner(System.in);
		System.out.println("Откуда ты");
		country=in.nextLine();
		
		switch(country) {
		
		case "USA":
			traditionalFood="Burger";
			break;
		case "Avganistan":
			traditionalFood="Palaw";
			break;
		case "Peru":
			traditionalFood="cevice";
			break;
		case "Italia":
			traditionalFood="pasta";
			break;
		case "Tajikistan":
			traditionalFood="kuruto";
			break;
		case "Russia":
			traditionalFood="borsch";
			break;
		default:
			traditionalFood="hz";
		
		}
		
		System.out.println("Ты родом из "+country+" твоя еда "+traditionalFood);

	}

}
