package com.cn.thread.getThreadName;

public class ThreadDemo1 {

    public static void main(String[] args) {
        MyThread thread = new MyThread();

        thread.setName("Test1");


        thread.start();


    }

}
