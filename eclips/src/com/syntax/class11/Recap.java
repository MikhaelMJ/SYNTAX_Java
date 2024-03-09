package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		
		int [][]array= {{1,2,3,4,5},
		                {10,20,30,40,50}};
		int sum=0;
		
		for(int row=0; row<array.length; row++) {
			for (int col=0; col<array[row].length; col++) {
				System.out.println(array[row][col]);
				sum=sum+array[row][col];
			}
			
		}
		System.out.println("Сумма равна "+ sum);

	}

}
