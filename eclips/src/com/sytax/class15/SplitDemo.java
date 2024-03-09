package com.sytax.class15;

public class SplitDemo {

	public static void main(String[] args) {
		
		//разделить выходные данные
		
		String str="This is Batch 10 is great";
		String[] strArr=str.split(" ");
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[5]);
		
		for(String string:strArr) {
			System.out.println(string);
		}

	}

}
