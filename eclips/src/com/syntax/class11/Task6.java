package com.syntax.class11;

public class Task6 {

	public static void main(String[] args) {
		
		int previousNumber=0;
		int currentNumer=1;
		int sumOfPreviousAndCurrent=0;
		int numbersToGenerate=10;
		System.out.println(previousNumber);
		System.out.println(currentNumer);
		for(int i=0; i<numbersToGenerate-2; i++) {
			sumOfPreviousAndCurrent=previousNumber+currentNumer;
			System.out.println(sumOfPreviousAndCurrent);
			previousNumber=currentNumer;
			currentNumer=sumOfPreviousAndCurrent;
		}

	}

}
