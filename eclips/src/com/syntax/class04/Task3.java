package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {
		
		int age = 20;
		double weight = 160;
		if (age>=18) {
			System.out.println("Проверим, соответствуете ли вы всем остальным требованиям");
			if (weight>100) {
				System.out.println("вы можете пожертвовать");
			} else {
				System.out.println("вы не можете пожертвоватьe");
			}
		} else {
			System.out.println("Вы не имеете права на пожертвование");
		}

	}

}
