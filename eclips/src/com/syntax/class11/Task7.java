package com.syntax.class11;

public class Task7 {

	public static void main(String[] args) {
		
		//макс и мин значение в массиве
		
		int[] array = {10,5,3,-5,15};
		
		int Largest = array[0];
		int smallest = array[0];
		for (int i = 1; i<array.length; i++) {
			if (array[i]>Largest) {
				Largest=array[i];
			}
			if(array[i]<smallest) {
				smallest=array[i];
			}
		}
		System.out.println(Largest);
		System.out.println(smallest);

	}

}
