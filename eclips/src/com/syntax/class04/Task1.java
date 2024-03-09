package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double score=3.7;
		
		if (diploma) {
			System.out.println("Поздравлю");
			
			if (score>=3.5) {
				System.out.println("Вы имеете право на получение стипендии");
			} else {
				System.out.println("Надо было учиться лучше");
			}
		} else {
			System.out.println("Получить высшее образование");
		}
		

	}

}
