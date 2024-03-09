package com.sytax.class15;

public class Task4 {

	public static void main(String[] args) {
		// создать строку и напечатать в обратном порядке
		
		String name="Sunday";
		String reversed="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			reversed+=name.charAt(i);
		}
		
		System.out.println(reversed);
		if(name.equals(reversed)) {
			System.out.println("Слово полиндром");
		}

	}

}
