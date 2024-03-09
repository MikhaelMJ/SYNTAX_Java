package com.syntax.class10;

public class HWLast {

	public static void main(String[] args) {
		// узнать самое большое число из массива
		
		int[] num= {100, 20, 67, 45, 90, 23};
		int largest = num[0];
		
		for(int i=1; i<num.length; i++) {
			
			if (num[i]>largest) {
				largest=num[i];
			}
		}
		
		System.out.println(largest);
		
		System.out.println("---расширен------");
		largest = num[0];
		
		for(int n:num) {
			
			if(n>largest) {
				largest=n;
			}
		}
		
		System.out.println(largest);

	}

}
