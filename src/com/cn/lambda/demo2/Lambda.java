package com.cn.lambda.demo2;

public class Lambda {
    public static void main(String[] args) {

        Thread t = new Thread(()-> System.out.println(Thread.currentThread().getName()+": is Running"),"Test");

        t.start();

    }

}
