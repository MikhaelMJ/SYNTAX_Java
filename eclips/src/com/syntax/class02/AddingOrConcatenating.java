package com.syntax.class02;

public class AddingOrConcatenating {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="World";
		
		int c=10;
		int d=20;
		
		System.out.println(c+d+a+b);
		System.out.println(a+c+b+d);
		System.out.println(a+(c+d)+b);
		System.out.println(a+c+d+b);
		System.out.println(a+b+c+d);
		
		char grade='A';
		
		String str="Student";
		
		String newString=grade+" "+str;
		System.out.println(newString);

	}

}
