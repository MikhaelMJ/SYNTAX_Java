package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		
		int [][]array= {{1,2,3,4,5},
                 {10,20,30,40,50}};


    for(int row=0; row<array.length; row++) {
	
	for (int col=0; col<array[row].length; col++) {
		
		if (array[row][col]%2==0) {
			System.out.println(array[row][col]);
		}
		
	}
	
	}

}
}
