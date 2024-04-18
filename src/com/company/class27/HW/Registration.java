package com.company.class27.HW;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.equals("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Не валидный email");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() < 6) {
            System.out.println("Имя пользователя не может быть принято");
        } else {
            this.userName = userName;
        }
    }


    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Пароль не может быть принят");
        } else if (password.contains(userName)) {
            System.out.println("Пароль содержит имя пользователя");
        } else {
            this.password = password;
        }
    }
    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
