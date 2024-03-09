package com.syntax.class04;

public class AnotherNestedIf {

	public static void main(String[] args) {

		boolean isCompleted = true;
		int score = 85;

		if (isCompleted) {
			System.out.println("Проверим вашу оценку");

			if (score > 90) {
				System.out.println("A student");
			} else if (score > 80) {
				System.out.println("B student");
			} else if (score > 70) {
				System.out.println("C student");
			} else {
				System.out.println("Пожалуйста, занимайтесь больше перед сдачей экзамена");
			}
		} else {
			System.out.println("Вы должны были пройти тест");
		}
	}

}
