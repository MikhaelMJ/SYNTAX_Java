package com.syntax.class03;

public class IfElseIfStatement {

	public static void main(String[] args) {
		
		//наибольшее число
		
		int num1=20;
		int num2=10;
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		} else if(num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		} else {
			System.out.println(num1 +" is equal to "+num2);
		}
		
		System.out.println("--------------------------");
		
		int day=70;
		
		if(day==1) {
			System.out.println("Today is Monday");
		} else if (day==2) {
			System.out.println("Today is Tuesdey");
		} else if (day==3) {
			System.out.println("Today is Wednesday");
		} else if (day==4) {
			System.out.println("Today is Thursday");
		} else if (day==5) {
			System.out.println("Today is Friday");
		} else if (day==6) {
			System.out.println("Today is Saturday");
		} else if (day==7) {
			System.out.println("Today is Sanday");
	    } else {
	    	System.out.println(day+" is invalid day number. Please use day from 1-7 ");
	    }
	}

}
