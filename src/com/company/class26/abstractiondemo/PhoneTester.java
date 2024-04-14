package com.company.class26.abstractiondemo;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone = new Samsung();
        phone.makePhoneCall();
        phone.sendSMS();
        phone.takePictures();
        phone.unlock();
    }
}
