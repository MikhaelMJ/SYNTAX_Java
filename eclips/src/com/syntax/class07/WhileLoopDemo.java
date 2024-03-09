package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		
		
		int a=0;
		while (a<10) {
			System.out.println("Как ты");
			a++;
		}
		
		System.out.println("---------------------------");
		
		System.out.println("Хочу напечатать цифры от 1 до 20");
		
		int q=1;
		while (q<=20) {
			System.out.println(q);
			q++;
		}
		
		System.out.println("от 100 до 150");
		
		int var=10;
		
		while (var>=1) {
			System.out.print(var+" ");
			var--;
		}
		
		System.out.println("напечатать нечетные числа");
		
		int n=1;
		
		while (n<21) {
			System.out.print(n+" ");
			n+=2;
		}
		
            n=1;
		
		while (n<21) {
			if (n%2!=0) {
			System.out.println(n);
			}
			n++;
		}

	}

}
