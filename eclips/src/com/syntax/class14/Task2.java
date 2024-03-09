package com.syntax.class14;

public class Task2 {
	
	//создать метод говорить привет на разных языках при вводе страны
	
	void printHello(String country) {
	
	switch(country) {
	case "USA":
		System.out.println("Hello");
		break;
	case "Germany":
		System.out.println("Halo");
		break;
	case "Afganistan":
		System.out.println("Salam");
		break;
	case "Turkey":
		System.out.println("Merhaba");
		break;
		default:
			System.out.println("Invalid");
	
	}

}
}
