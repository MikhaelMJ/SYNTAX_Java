package com.company.class26.abstractiondemo;

public abstract class Phone {
    public void makePhoneCall(){
        System.out.println("Calling");
    }
    public void sendSMS(){
        System.out.println("Sending sms");
    }
    public abstract void takePictures();
    public abstract void unlock();
}
class Iphone extends Phone{
    @Override
   public void takePictures(){
       System.out.println("Делает снимки 12mp");
   }
   public void unlock(){
       System.out.println("unlocks with face id");
   }
}
class Samsung extends Phone{
    @Override
    public void takePictures() {
        System.out.println("Делает снимки 188mp");
    }

    @Override
    public void unlock() {
        System.out.println("unlocks with fingerprint");
    }
}