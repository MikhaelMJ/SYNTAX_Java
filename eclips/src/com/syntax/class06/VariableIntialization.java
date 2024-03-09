package com.syntax.class06;

import java.util.Scanner;

public class VariableIntialization {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Пожалуйста введи свое имя");
		String name=in.nextLine();
		
		System.out.println("Пожалуйста укажите свой возвраст");
		int age=in.nextInt();
		
		String whoAreYou;
		
		if (age>=0 && age<3) {
			whoAreYou="baby";
		}else if (age>=3 && age<6) {
			whoAreYou="toddler";
		}else if (age>=6 && age<13) {
			whoAreYou="kid";
		}else if (age>=13 && age<20) {
			whoAreYou="teenager";
		}else if (age>=20 && age<65) {
			whoAreYou="adult";
		}else if (age>=65){
			whoAreYou="senior";
		}else {
			whoAreYou="Ты кто вообще";
		}
		
		System.out.println(name+" you are "+whoAreYou);

	}

}
