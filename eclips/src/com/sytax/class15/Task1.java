package com.sytax.class15;

public class Task1 {

	public static void main(String[] args) {
		
		String userName="Sharif";
		String password="pass123";
		String confirmpassword="skdfgbk";
		
		if(!(userName.isEmpty()||password.isEmpty())) {
			if(password.length()>=8) {
				if(password.contains(userName)) {
					if(password.equals(confirmpassword)) {
						System.out.println("пароль и пользователь созданы");
					}else {
						System.out.println("Пароли не совпадают");
					}
				}else {
					System.out.println("Пароль не должен содеражать имя пользователя");
				}
			}else {
				System.out.println("Пароль слишком короткий");
			}
		}else {
			System.out.println("Пользователь и пароль не могут быть пустыми");
		}

	}

}
