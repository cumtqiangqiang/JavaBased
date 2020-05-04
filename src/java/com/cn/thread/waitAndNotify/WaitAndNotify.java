package com.cn.thread.waitAndNotify;

public class WaitAndNotify {
    public static void main(String[] args) {
        Bun bun = new Bun();
        new Thread(new BunShop(bun),"BunShop").start();
        new Thread(new Person(bun),"Person").start();


    }


}
