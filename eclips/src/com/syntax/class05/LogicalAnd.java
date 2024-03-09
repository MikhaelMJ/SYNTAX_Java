package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean understandJava=true;
		boolean enjoy=true;
		if(understandJava && enjoy) {
			
			System.out.println("Это отлично");
		}else {
			System.out.println("Уделяйте больше времени джаве");
		}
		
		int num=1;
		
		if (num > 0) {
		
		if(num>1 && num<10) {
			
			System.out.println("Число маленькое");
			
		}else if (num>10 && num<100) {
			
			System.out.println("Число среднее");
			
		}else if (num>100 && num<1000) {
			
			System.out.println("Число большое");
			
		}else {
			
			System.out.println("Число огромное");
		}
		
		}else {
			System.out.println("Число отрицательное");
		}

	}

}
