package com.cn.thread.runnable;

public class RunnableImpl1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            System.out.println("RunnableImpl1 : " + i );

        }
    }
}
