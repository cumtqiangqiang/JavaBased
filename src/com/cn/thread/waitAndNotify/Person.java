package com.cn.thread.waitAndNotify;

public class Person implements Runnable {
    Bun bun;

    public Person(Bun bun) {
        this.bun = bun;
    }

    @Override
    public void run() {
     while (true){
         synchronized (bun){
             if (bun.flag == false){
                 try {
                     bun.wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
             System.out.println("人正在吃 "+bun.bunSkin+bun.xian+"的包子");
             bun.flag = false;
             bun.notify();
             System.out.println("人已经吃完了 "+bun.bunSkin+bun.xian+"的包子");
             System.out.println("-------------------------------------------------");

         }


     }
    }
}
