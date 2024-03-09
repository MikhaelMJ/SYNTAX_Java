package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {
		
		int a;
		int[] b;
		
		
		int[][] c=new int[3][4];
		//1 ряд
		c[0][0]=11;
		c[0][1]=12;
		c[0][2]=13;
		c[0][3]=14;
		//2 ряд
		c[1][0]=20;
		c[1][1]=30;
		c[1][2]=40;
		c[1][3]=50;
		// 3 ряд
		c[2][0]=100;
		c[2][1]=200;
		c[2][2]=300;
		c[2][3]=400;
		
		System.out.println(c[1][3]); //50
		System.out.println(c[2][1]); //200
		
		System.out.println("более короткий путь");
		
		int[][] myArray= {
				
				           {11,12,13,14,15},
				           {20,30,40},
				           {100,200,300,400}
				
		                                       };
		System.out.println(myArray[0][4]);

	}

}


