package com.company.class23.task1;

public class UserInfo extends UseClass{
    String address;

    UserInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address=address;
    }
    void userDetails(){
        System.out.println(name+" "+mobileNumber+" "+address);
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Nina","656658",
                "blabla");
        userInfo.userDetails();
    }
}
