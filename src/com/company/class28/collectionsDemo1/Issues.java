package com.company.class28.collectionsDemo1;

public class Issues {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num);
        num=20;
        System.out.println(num);
        int[] numArr=new int[3];
        numArr[0]=12;
        numArr[1]=12;
        numArr[2]=12;
        System.out.println("длина сейчас "+numArr.length);
        System.out.println("_____________________");
        //numArr[3]=12; лишний элемент
        int [] newBiggerArr=new int[4];
        newBiggerArr[0]= numArr[0];
        newBiggerArr[1]= numArr[1];
        newBiggerArr[2]= numArr[2];
        newBiggerArr[3]= 100;
        numArr=newBiggerArr;
        System.out.println(numArr[3]);
        System.out.println("длина после "+numArr.length);
        System.out.println("_____________________");

            
        }
    }

