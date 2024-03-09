package com.syntax.class06;

public class LogicalOperatorsRecap {

	public static void main(String[] args) {
		
		String position="Автоматизация";
		
		if (position.equals("Автоматизация") || position.equals("Ручное тестирование")) {
			System.out.println("Я счастлив");
		}
		
		System.out.println("-----Например-------");
		
		int salary=10000;
		
		if (position.equals("Автоматизация") && salary>=100000) {
			System.out.println("Будет очень круто");
		} else {
			System.out.println("Печаль");
		}
		
		System.out.println("-----Например-------");
		
		boolean study=false;
		
		if (!study) {
			System.out.println("Я не найду работу");
		}

	}

}
