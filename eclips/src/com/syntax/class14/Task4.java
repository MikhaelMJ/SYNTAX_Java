package com.syntax.class14;

public class Task4 {
	
	//метод является ли данное число простым
	
	
	boolean isPrime(int number) {
	if(number>1) {
	for(int i=2; i<number; i++) {
	if(number%i==0) {
	return false;
	}
	}
	}else {
	return false;
	}
	
	return true;
}
	char getGrade(double score) {
		
		if (score>90) {
			return 'A';
			
		}else if(score>80) {
			return 'B';
		}else if(score>70) {
			return 'C';
		}else if(score>50) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
}
