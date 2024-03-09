package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		
		int [][]array= {{1,2,3,4,5},
                {10,20,30,40,50}};
    int evenSum = 0;
    int addSum = 0;

    for(int row=0; row<array.length; row++) {
	
	for (int col=0; col<array[row].length; col++) {
		
		if (array[row][col]%2==0) {
			evenSum=evenSum+array[row][col];
		}else {
			addSum=addSum+array[row][col];
		}
	}

   }
    
    System.out.println("Сумма четных равна " +evenSum);
    System.out.println("Сумма нечетных равна " +addSum);
   }
   }

