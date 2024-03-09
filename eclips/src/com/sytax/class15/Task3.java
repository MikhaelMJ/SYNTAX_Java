package com.sytax.class15;

public class Task3 {

	public static void main(String[] args) {
		// создать строку, если строка не пустая
		
		String name="Hello";
		if(!name.isEmpty()) {
			if (name.length()>3 && name.length()%2!=0) {
				System.out.println(name.charAt(name.length()/2));
			}
		}

	}

}
