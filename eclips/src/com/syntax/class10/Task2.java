package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		String[] country= {"USA", "Russia", "Italia"};
		
		String capital = "";
		
		for(int i=0; i<country.length; i++) {
			
			switch(country[i]) {
			case "USA":
				capital="Washington";
				break;
			case "Russia":
				capital="Moscov";
				break;
			case "Italia":
				capital="Roma";
				break;	
			}
			
			System.out.println("Столица "+country[i]+" "+capital);
		
			}
		System.out.println("----Другой вариант------");
		
		capital="";
		
		for(String contries:country) {
			if (contries.equals("USA")) {
				capital="Washington";
			}else if(contries.equals("Russia")) {
				capital="Moscov";
			}else if(contries.equals("Italia")) {
				capital="Roma";
			}
			
			System.out.println("Столица "+contries+" "+capital);
		
		}

	}

}
