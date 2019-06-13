package com.cn.thread.runnable;

public class RunnableDemo1 {

    public static void main(String[] args) {
        Runnable r = new RunnableImpl1();
        r.run();
        Thread t = new Thread(new RunnableImpl2());
        t.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName() + " : "+i);
        }


    }
}
