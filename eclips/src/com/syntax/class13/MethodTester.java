package com.syntax.class13;

public class MethodTester {

	public static void main(String[] args) {
		
		Methods method = new Methods();
		method.RepeatWords(3, "Sintax");
		method.isItRaining(false);
		
		int sum=method.add(10, 10);
		
		System.out.println(sum);
	}

}
