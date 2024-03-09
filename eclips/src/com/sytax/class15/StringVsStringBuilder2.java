package com.sytax.class15;

public class StringVsStringBuilder2 {

	public static void main(String[] args) {
		
		String str="ABCD";
		System.out.println(str.concat("z"));
		System.out.println(str);
		System.out.println("--------------------");
		StringBuilder str2=new StringBuilder("ABCD");
		System.out.println(str2.append("z"));
		System.out.println(str2);
		
		StringBuilder str3 = new StringBuilder("Sunday");
		System.out.println(str3.reverse());
		
		String name="Ali";
		StringBuilder str4=new StringBuilder(name);//преобразование строки в конструктор строки
		System.out.println(str4);
		
		name=str4.toString();//преобразование конструктора строк в строку
		System.out.println(name);
		
		StringBuffer strin=new StringBuffer("uktfughij");
		

	}

}
