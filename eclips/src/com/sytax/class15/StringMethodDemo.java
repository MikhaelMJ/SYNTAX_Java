package com.sytax.class15;

public class StringMethodDemo {

	public static void main(String[] args) {
		
		String str="I am a good men";
		System.out.println(str.replace("good", "bad"));
		
		String str2="douhq8qw64$%^8r9ogno89866";
		System.out.println(str2.replaceAll("[0-9]", ""));//регулярные выражения [0-9]
		System.out.println(str2.replaceAll("[a-z]", ""));//даление строчных букв [a-z]
		System.out.println(str2.replaceAll("[a-z0-9]", ""));//несколько условий
		System.out.println(str2.replaceAll("[^a-z0-9]", ""));//убрать специальные символы

	}

}
