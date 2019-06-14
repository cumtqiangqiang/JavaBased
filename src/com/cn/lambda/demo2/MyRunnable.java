package com.cn.lambda.demo2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":is Running");
    }
}
