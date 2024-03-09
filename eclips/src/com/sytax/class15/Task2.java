package com.sytax.class15;

public class Task2 {

	public static void main(String[] args) {
		
		String dadsName="Ali";
		String momsName="Maria";
		String expectation="girl";
		
		if (expectation.equalsIgnoreCase("boy")) {
			String firstHalf=dadsName.substring(0,dadsName.length()/2);
			String lastHalf=momsName.substring(momsName.length()/2);
			System.out.println(firstHalf+lastHalf);
		}else {
			String firstHalf=momsName.substring(0,momsName.length()/2);
			String lastHalf=dadsName.substring(dadsName.length()/2);
			System.out.println(firstHalf+lastHalf);
		}

	}

}
