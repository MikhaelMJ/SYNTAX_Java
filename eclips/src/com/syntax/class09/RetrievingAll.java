package com.syntax.class09;

public class RetrievingAll {

	public static void main(String[] args) {
		
		char[] grades= {'A', 'B', 'C', 'D'};
		System.out.println(grades.length);
		int size=grades.length; //сколько значений, какова длина
		System.out.println(size); //количество элементов в массиве
		
		System.out.println(grades[1]);
		
		int i=0;
		System.out.println(grades[i]);
		
		i++;
		System.out.println(grades[i]);
		
		System.out.println("-------------------------");
		
		for (int j = 0; j<size; j++) {
			System.out.println(grades[j]);
			
			System.out.println("----------------------------------------");
			
			String[] names= {"Jone", "Blake", "Anna", "Vasya", "Vova", "Nina", "Olya"};
			
			for (int a=0; a<names.length; a++) {
				System.out.println(names[a]);
			}
		}
		
		System.out.println("---------------------------------");
		
		String[] cars= {"BMW", "Lada", "Volvo", "Mazda", "Opel", "Kia"};
		
		for (int f=0; f<cars.length; f++) {
			System.out.println(cars[f]);
		}
		
		System.out.println("-------------For each---------");
		
		for(String car:cars) {
			System.out.println(car);
		}
		
		System.out.println("-------------Numbers Array---------");
		
		int[] numbers= {100, 20, 67, 45, 90, 23};
		
		for (int o=0; o<numbers.length; o++) {
			System.out.println(numbers[o]);
		}
		
		

	}

}
