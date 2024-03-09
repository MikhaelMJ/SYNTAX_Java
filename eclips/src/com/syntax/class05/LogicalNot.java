package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean b=!true;
		
		boolean a=false;
		System.out.println(b);
		System.out.println(a);
		System.out.println("_________________");
		
		boolean hungry=true;
		
		if(!hungry) {
			System.out.println("Я не голоден");
		}
		
		System.out.println("----------------------------");
		
		boolean hot=false;
		if (!hot) {
			System.out.println("Я пойду");
		}
		
		System.out.println("Конец части кода");
		
		String name="Dima";
		
		if (!name.equals("Misha")) {
			System.out.println("Ты мне не нужен");
		}

	}

}
