package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="Вторник";
		
		if (day.equals("Понедельник") || day.equals("Пятница")) {
			System.out.println("Нет занятий");
			
		}else if (day.equals("Вторник") || day.equals("Среда")) {
			System.out.println("Ручное тестирование");
			
		}else if (day.equals("Четверг")) {
			System.out.println("Экзамены");
			
		} else if (day.equals("Суббота") || day.equals("Воскресенье")) {
			System.out.println("Мой любимый урок джава");
			
		} else {
			System.out.println("Укажите действительный день");
		}

	

}
}
