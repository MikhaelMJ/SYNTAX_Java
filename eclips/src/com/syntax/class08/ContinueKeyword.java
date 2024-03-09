package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i=0; i<=3; i++) {
			
			if(i==1) {
				continue;
			}
			
			System.out.println(i);
		}
		
		//напечатать от 1 до 10 без номера 5
		
		for(int i=1; i<=10; i++) {
			if (i==5) {
				continue;
			}
			System.out.print(i + " ");
		}
		

	}

}
