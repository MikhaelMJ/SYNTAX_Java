package com.syntax.class14;

public class Task3Tester {

	public static void main(String[] args) {
		
		Task3 task3 = new Task3();
		String fullEmail=task3.createEmail("Anna", "Mary", "gmail");
		System.out.println(fullEmail);
		System.out.println(task3.createEmail("Anna", "Mary", "gmail"));
	}

}
