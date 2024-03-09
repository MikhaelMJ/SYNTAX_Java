package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		
		// Д/з создать массив целых чисел и вычислить сумму всех целых элементов
		
		int[] num= {100, 20, 67, 45, 90, 23};
		int sum = 0;
		for (int d=0; d<num.length; d++) {
		    
			sum = sum + num[d];
		}
		System.out.println(sum);
		
		System.out.println("------расширенный режим------");
		sum=0;
		
        for (int n:num) {
		    
			sum += n;
		}
        
        System.out.println(sum);

	}

}
