package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		
		String[][] food= {
				{"borsh", "vareniki", "draniki"},
				{"kebabs", "palaw", "mantu"},
				{"tacos", "burito", "queso", "salsa"},
				{"pasta", "pizza", "bread", "rizoto"}
		};
		
		System.out.println(food.length);
		
		int sizeOfArray=food[0].length;
		
		System.out.println(sizeOfArray);
		
		System.out.println(food[2][1]);
		food[3][2]="cheese";
		
		System.out.println(food[3][2]);
		
		System.out.println("---------task-------");
		
		String[][] people= {
				{"Mr", "Mrs", "Ms","Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"} };
		
		System.out.println(people[0][1]+" "+people[1][0]);
		System.out.println(people[0][0]+" "+people[1][3]);
		System.out.println(people[0][2]+" "+people[1][2]);
		System.out.println(people[0][3]+" "+people[1][1]);
		
		System.out.println("--------------------------");
		
        for(int r=0; r<people.length; r++) { 
			
			for(int c=0; c<people[r].length; c++) {
				System.out.print(people[r][c]+" ");
			}
			System.out.println();
		}
        
        System.out.println("------------------------");
        
        for(String[] arr:people) {
        	for(String a:arr) {
        		System.out.print(a+" ");
        	}
        	System.out.println();
        }
		
		System.out.println("-----каждый элемент--------------");
		
		//получить все значения из двумерного массива
		
		for(int i=0; i<food.length; i++) { //итерация по строкам
			
			for(int j=0; j<food[i].length; j++) {//по каждому элементу
				System.out.println(food[i][j]);
			}
			
			
		}

	}

}
