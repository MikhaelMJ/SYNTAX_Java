package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		boolean secondDose=true;
		
		if(vaccine) {
			System.out.println("Lets check how many doses you got");
			
			if(secondDose) {
				System.out.println("You are fully vacciated");
			} else {
				System.out.println("You will need to get a 2nd dose");
			}
		} else {
			System.out.println("Fack you");
			
		}
		
		System.out.println("-----------");
		
		int day=1;
		boolean isFriday=true;
		
		if (isFriday) {
			System.out.println("I am going to watch a movie");
			
			if (day==13) {
				System.out.println("I am watching scary movie");
			} else {
				System.out.println("I am watching whatever is popular");
			}
		} else {
			System.out.println("I am going to study");
		}

	}

	}

