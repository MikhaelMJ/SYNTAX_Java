package com.syntax.class14;

public class StringDemo {

	public static void main(String[] args) {
		
		String str="12345";
		
		String str2 = new String ("Hello");
		
		System.out.println(str.length());
		
		String name="MICHAEL";
		System.out.println(name.toLowerCase());
		
		String name2="michael dzhenkov";
		System.out.println(name2.toUpperCase());
		
		String firstname="Andrey";
		String lastname="Pyatochkin";
		System.out.println(firstname.concat(" ").concat(lastname));

	}

}
