package com.sytax.class15;

public class SplitDemo3 {

	public static void main(String[] args) {
		
		String str="This is Batch 10? Batch is great? How are you";
		String[] strArr=str.split("[?]");
		
		System.out.println(strArr.length);

	}

}
