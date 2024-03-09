package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {
			
			System.out.println("Loop i");
			
			for(int j = 0; j <= 3; j++) {
				System.out.println("Loop j");
			}
			
		}
		
		System.out.println("-------------------------");
		
		for(int i = 1; i < 4; i++) {
			
			for(int j = 1; j < 3; j++) {
				
				System.out.println(i+" "+j);
				
			}
		}

	}

}
