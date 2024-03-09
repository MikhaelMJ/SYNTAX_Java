package com.syntax.class14;

public class MethodsTester {

	public static void main(String[] args) {
		
		int[] ass= {10,10,10,10};
		
		Methods method = new Methods();
		ass=method.doubleTheArray(ass);
		
		for (int i=0; i<ass.length;i++) {
			System.out.print(ass[i]+" ");
		}
	}

}
