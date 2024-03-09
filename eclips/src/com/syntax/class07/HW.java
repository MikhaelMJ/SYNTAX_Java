package com.syntax.class07;

public class HW {

	public static void main(String[] args) {
		
		//распечатать четные и нечетные цифры от 1 до 100 и их сумму
		
		System.out.println("напечатать нечетные от 1 до 100 и их сумму");
		
		int sum=0;
		
		for (int i = 1; i<=100; i++) {
			
			if (i%2 != 0) {
			sum=sum+i;
			}
		}
			
			System.out.print(sum);


}
}