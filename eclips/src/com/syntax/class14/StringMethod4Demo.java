package com.syntax.class14;

public class StringMethod4Demo {

	public static void main(String[] args) {
		
		String longStr="This class is easy";
 		System.out.println(longStr.endsWith("y"));
 		System.out.println(longStr.endsWith("easy"));
 		System.out.println(longStr.endsWith("is easy"));
 		
 		System.out.println("---------------------");
 		
 		System.out.println(longStr.contains("class"));
 		System.out.println(longStr.contains("dfg"));
 		longStr="blabla";
 		System.out.println(longStr.charAt(0));
 		System.out.println(longStr.charAt(1));
 		System.out.println(longStr.charAt(2));
 		System.out.println(longStr.charAt(3));
 		System.out.println("-------------------");
 		System.out.println(longStr.indexOf("a"));
 		System.out.println(longStr.indexOf("b", longStr.indexOf("b")+1));
 		
 		System.out.println("-------------------------");
 		
 		System.out.println(longStr.substring(2,4));

	}

}
