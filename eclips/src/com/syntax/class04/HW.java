package com.syntax.class04;

public class HW {

	public static void main(String[] args) {
		
		double number=11;
		if (number>0) {
			System.out.println(number+" is a positive number");
		} else if (number<0) {
			System.out.println(number+" is a negative number");
		} else {
			System.out.println("Your number is "+number);
		}
		System.out.println("-------------");
		
		int evenOdd=16;
		if (evenOdd % 2==0) {
			System.out.println(evenOdd+" is an even number");
		} else {
			System.out.println(evenOdd+" is an odd number");
		}
		

	}

}
