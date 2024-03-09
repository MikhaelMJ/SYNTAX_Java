package com.syntax.class07;

import java.util.Scanner;

public class Lotterey {

	public static void main(String[] args) {
		
		Scanner in;
		int secretNumber, userNumber;
		secretNumber=15;
		
		in=new Scanner(System.in);
		do {
		System.out.println("Угадайте мой секретный номер");
		userNumber=in.nextInt();
	}while(userNumber != secretNumber);
		
		
		System.out.println("Вы победили");
		

}
}
